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


public class ArchiTreeMonitor extends JPanel {
  
	protected DefaultMutableTreeNode rootNode;
    protected DefaultMutableTreeNode nodes;
    protected DefaultMutableTreeNode components;
    protected DefaultMutableTreeNode channels;  
    
    protected DefaultTreeModel treeModel;
    protected JTree tree;
    private Toolkit toolkit = Toolkit.getDefaultToolkit();


    public ArchiTreeMonitor() {
        super(new GridLayout(1,0));
    	Dimension d =new Dimension(200, 300);
    	setSize(d);
    	setPreferredSize(d);
    	setMinimumSize(d);
        
        rootNode = new DefaultMutableTreeNode("Architecture");
        nodes= new DefaultMutableTreeNode("nodes");
        components= new DefaultMutableTreeNode("components");
        channels= new DefaultMutableTreeNode("channels");
     
        
        rootNode.add(nodes);
        rootNode.add(components);
        rootNode.add(channels);
        
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

    public void addNode(String nodeName) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(nodeName);
        DefaultMutableTreeNode  parent = nodes;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addComponent(String componentName) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(componentName);
        DefaultMutableTreeNode  parent = components;
        treeModel.insertNodeInto(childNode, parent, 
                                 parent.getChildCount());
          tree.scrollPathToVisible(new TreePath(childNode.getPath()));
    }
    
    public void addChannel(String channelName) {
    	DefaultMutableTreeNode childNode = 
                new DefaultMutableTreeNode(channelName);
        DefaultMutableTreeNode  parent = channels;
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

            /*
             * If the event lists children, then the changed
             * node is the child of the node we've already
             * gotten.  Otherwise, the changed node and the
             * specified node are the same.
             */

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
