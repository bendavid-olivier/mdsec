package policyTools.guiEditor.graphicComponents;

import javax.swing.JPanel;
import javax.swing.JScrollPane;


import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;


import java.awt.Dimension;


public class PolicyTreeMonitor extends JPanel {
  
	
	protected DefaultMutableTreeNode rootNode;
    protected DefaultMutableTreeNode users;
    protected DefaultMutableTreeNode roles;
    protected DefaultMutableTreeNode permissions;
    protected DefaultMutableTreeNode operations;
    protected DefaultMutableTreeNode objects;
    protected DefaultMutableTreeNode sessions;
    
    
    protected DefaultTreeModel treeModel;
    protected JTree tree;
    private Toolkit toolkit = Toolkit.getDefaultToolkit();


    public PolicyTreeMonitor() {
        super(new GridLayout(1,0));
    	Dimension d =new Dimension(200, 300);
    	setSize(d);
    	setPreferredSize(d);
    	setMinimumSize(d);
        
        rootNode = new DefaultMutableTreeNode("Policy");
        users= new DefaultMutableTreeNode("users");
        roles= new DefaultMutableTreeNode("roles");
        permissions= new DefaultMutableTreeNode("permissions");
        operations= new DefaultMutableTreeNode("operations");
        objects= new DefaultMutableTreeNode("objects");
        sessions= new DefaultMutableTreeNode("sessions");
        
        rootNode.add(users);
        rootNode.add(roles);
        rootNode.add(permissions);
        rootNode.add(operations);
        rootNode.add(objects);
        rootNode.add(sessions);
        
        treeModel = new DefaultTreeModel(rootNode);
        treeModel.addTreeModelListener(new MyTreeModelListener());
        tree = new JTree(treeModel);
        tree.setEditable(true);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setShowsRootHandles(true);

        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane);
    }

    /** Remove all nodes except the root node. */
    public void clear() {
        rootNode.removeAllChildren();
        treeModel.reload();
    }

    /** Remove the currently selected node. */
    public void removeCurrentNode() {
        TreePath currentSelection = tree.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode)
                         (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode)(currentNode.getParent());
            if (parent != null) {
                treeModel.removeNodeFromParent(currentNode);
                return;
            }
        } 
        // Either there was no selection, or the root was selected.
        toolkit.beep();
    }

    /** Add child to the currently selected node. */
    public DefaultMutableTreeNode addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = tree.getSelectionPath();

        if (parentPath == null) {
            parentNode = rootNode;
        } else {
            parentNode = (DefaultMutableTreeNode)
                         (parentPath.getLastPathComponent());
        }

        return addObject(parentNode, child, true);
    }

    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child) {
        return addObject(parent, child, false);
    }

    public void addUser(String user) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(user);
        DefaultMutableTreeNode  parent = users;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addRole(String role) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(role);
        DefaultMutableTreeNode  parent = roles;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addPermission(String permission) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(permission);
        DefaultMutableTreeNode  parent = permissions;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addOperation(String operation) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(operation);
        DefaultMutableTreeNode  parent = operations;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addObjectP(String object) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(object);
        DefaultMutableTreeNode  parent = objects;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addSession(String session) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(session);
        DefaultMutableTreeNode  parent = sessions;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    
    
    
    public DefaultMutableTreeNode addObject(DefaultMutableTreeNode parent,
                                            Object child, 
                                            boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = rootNode;
        }
	
	//It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());

        //Make sure the user can see the lovely new node.
        if (shouldBeVisible) {
            tree.scrollPathToVisible(new TreePath(childNode.getPath()));
        }
        return childNode;
    }

    class MyTreeModelListener implements TreeModelListener {
        public void treeNodesChanged(TreeModelEvent e) {
            DefaultMutableTreeNode node;
            node = (DefaultMutableTreeNode)(e.getTreePath().getLastPathComponent());

                int index = e.getChildIndices()[0];
                node = (DefaultMutableTreeNode)(node.getChildAt(index));

            System.out.println("The user has finished editing the node.");
            System.out.println("New value: " + node.getUserObject());
        }
        public void treeNodesInserted(TreeModelEvent e) {
        }
        public void treeNodesRemoved(TreeModelEvent e) {
        }
        public void treeStructureChanged(TreeModelEvent e) {
        }
    }
}
