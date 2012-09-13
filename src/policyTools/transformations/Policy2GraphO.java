package policyTools.transformations;
import policy.*;
import policy.impl.*;
import grapho.*;
import graphoTools.editor.GraphOEditor;
public class Policy2GraphO{
	private Policy policy;
	public Policy2GraphO(Policy x) {
		policy = x;
	}
	public GraphO transformation() {
	    GraphoFactory factory = GraphoFactory.eINSTANCE;
		GraphO g = factory.createGraphO();
		GraphOEditor editor = new GraphOEditor(g);

		Node mainNode = factory.createNode();
		mainNode.setColor("blue");
		mainNode.setLabel(policy.getName());
		mainNode.setName(policy.getName());
		mainNode.setShape("ellipse");
		mainNode.setStyle("solid");
		g.getElements().add(mainNode);

		addPolicyElements(policy, g);
		return g;
	}
	
	
	
	public void addPolicyElements(Policy pc, GraphO g) {
		GraphOEditor editor = new GraphOEditor(g);
		GraphoFactory factory = GraphoFactory.eINSTANCE;

		for (PolicyElement e : pc.getElements()) {
			if (e instanceof PolicyImpl) {
				Node n = factory.createNode();
				n.setColor("green");
				n.setLabel(e.getName());
				n.setName(e.getName());
				n.setShape("ellipse");
				n.setStyle("solid");
				g.getElements().add(n);
			}

			if (e instanceof UserImpl) {
				Node n = factory.createNode();
				n.setColor("black");
				n.setLabel(e.getName());
				n.setName(pc.getName() + e.getName());
				n.setShape("ellipse");
				n.setStyle("solid");
				g.getElements().add(n);
			}
			if (e instanceof RoleImpl) {
				Node n = factory.createNode();
				n.setColor("black");
				n.setLabel(e.getName());
				n.setName(pc.getName() + e.getName());
				n.setShape("ellipse");
				n.setStyle("solid");
				g.getElements().add(n);
			}
			if (e instanceof PermissionImpl) {
				Node n = factory.createNode();
				n.setColor("black");
				n.setLabel(e.getName());
				n.setName(pc.getName() + e.getName());
				n.setShape("ellipse");
				n.setStyle("solid");
				g.getElements().add(n);
			}
			if (e instanceof OperationImpl) {
				if ((!(((Operation) e).getPermissions().size() > 0))
						&& (!(((Operation) e).getObjects().size() > 0))) {
					Node n = factory.createNode();
					n.setColor("black");
					n.setLabel(e.getName());
					n.setName(pc.getName() + e.getName());
					n.setShape("ellipse");
					n.setStyle("solid");
					g.getElements().add(n);
				}
			}

			if (e instanceof ObjectImpl) {
				Node n = factory.createNode();
				n.setColor("black");
				n.setLabel(e.getName());
				n.setName(pc.getName() + e.getName());
				n.setShape("ellipse");
				n.setStyle("solid");
				g.getElements().add(n);
			}

//			if (e instanceof ConstraintImpl) {
//				Node n = factory.createNode();
//				n.setColor("black");
//				n.setLabel(e.getName());
//				n.setName(pc.getName() + e.getName());
//				n.setShape("ellipse");
//				n.setStyle("solid");
//				g.getElements().add(n);
//			}

//			if (e instanceof SessionImpl) {
//				Node n = factory.createNode();
//				n.setColor("black");
//				n.setLabel(e.getName());
//				n.setName(pc.getName() + e.getName());
//				n.setShape("box");
//				n.setStyle("solid");
//				g.getElements().add(n);
//			}
		}
		addPolicyRelationships(pc, g);
	}

	public void addPolicyRelationships(Policy pc, GraphO g) {
		GraphOEditor editor = new GraphOEditor(g);
		GraphoFactory factory = GraphoFactory.eINSTANCE;
		// adding relationships
		for (PolicyElement e : pc.getElements()) {
			// root -> policies
			if (e instanceof PolicyImpl) {
				Edge ed = factory.createEdge();
				ed.setName(pc.getName() + e.getName());
				ed.setColor("black");
				ed.setStyle("solid");
				ed.setConstraintRank(true);
				ed.setNodeA(editor.getNodeByName(pc.getName()));
				ed.setNodeB(editor.getNodeByName(e.getName()));
				g.getElements().add(ed);

				if (((Policy) e).getElements().size() > 0) {
					addPolicyElements((Policy) e, g);
				}
			}

			// user->assignedRoles
			if (e instanceof UserImpl) {
				Edge ed = factory.createEdge();
				ed.setName(pc.getName() + e.getName());
				ed.setColor("black");
				ed.setStyle("solid");
				ed.setConstraintRank(true);
				ed.setNodeA(editor.getNodeByName(pc.getName()));
				ed.setNodeB(editor.getNodeByName(pc.getName() + e.getName()));
				g.getElements().add(ed);

				for (Role r : ((User) e).getRoles()) {
					Edge ed2 = factory.createEdge();
					ed2.setName(e.getName() + r.getName());
					ed2.setColor("black");
					ed2.setStyle("solid");
					ed2.setConstraintRank(true);
					ed2.setNodeA(editor.getNodeByName(pc.getName()
							+ e.getName()));
					ed2.setNodeB(editor.getNodeByName(pc.getName()
							+ r.getName()));
					g.getElements().add(ed2);
				}
			}
			

			// user->user
			if (e instanceof UserImpl) {
				for (User u : ((User) e).getDelegatees()) {
					Edge ed = factory.createEdge();
					ed.setName(e.getName() + u.getName());
					ed.setColor("black");
					ed.setStyle("dashed");
					ed.setConstraintRank(false);
					ed.setNodeA(editor.getNodeByName(pc.getName() + e.getName()));
					ed.setNodeB(editor.getNodeByName(pc.getName() + u.getName()));
					g.getElements().add(ed);
				}
			}

			// session->activatedRoles
			if (e instanceof SessionImpl) {
				for (Role r : ((Session) e).getRoles()) {
					Edge ed2 = factory.createEdge();
					ed2.setName(e.getName() + r.getName());
					ed2.setColor("black");
					ed2.setStyle("dotted");
					ed2.setConstraintRank(true);
					ed2.setNodeA(editor.getNodeByName(pc.getName()
							+ ((Session) e).getUser().getName()));
					ed2.setNodeB(editor.getNodeByName(pc.getName()
							+ r.getName()));
					g.getElements().add(ed2);
				}
			}
			
			
			
			// role->assignedPermissions
			if (e instanceof RoleImpl) {
				for (Permission p : ((Role) e).getPermissions()) {
					Edge ed = factory.createEdge();
					ed.setName(pc.getName() + e.getName() + p.getName());
					ed.setColor("black");
					ed.setStyle("solid");
					ed.setConstraintRank(true);
					ed.setNodeA(editor.getNodeByName(pc.getName() + e.getName()));
					ed.setNodeB(editor.getNodeByName(pc.getName() + p.getName()));
					g.getElements().add(ed);
				}
			}

			// SSOD role->role
			if (e instanceof RoleImpl) {
				for (Role r : ((Role) e).getSsod()) {
					Edge ed = factory.createEdge();
					ed.setName(pc.getName() + e.getName() + r.getName());
					ed.setColor("red");
					ed.setStyle("dashed");
					ed.setConstraintRank(false);
					ed.setNodeA(editor.getNodeByName(pc.getName() + e.getName()));
					ed.setNodeB(editor.getNodeByName(pc.getName() + r.getName()));
					g.getElements().add(ed);
					
					Edge ed2 = factory.createEdge();
					ed2.setName(pc.getName() + r.getName()+e.getName());
					ed2.setColor("red");
					ed2.setStyle("dashed");
					ed2.setConstraintRank(false);
					ed2.setNodeA(editor.getNodeByName(pc.getName() + r.getName()));
					ed2.setNodeB(editor.getNodeByName(pc.getName() + e.getName()));
					g.getElements().add(ed2);
				}
			}

			// permission->operation->object
			if (e instanceof PermissionImpl) {
				for (Operation o : ((Permission) e).getOperations()) {
					Node n = factory.createNode();
					n.setColor("black");
					n.setLabel(o.getName());
					n.setName(pc.getName() + e.getName() + o.getName());
					n.setShape("ellipse");
					n.setStyle("solid");
					g.getElements().add(n);

					Edge ed = factory.createEdge();
					ed.setName(pc.getName() + e.getName() + o.getName());
					ed.setColor("black");
					ed.setStyle("solid");
					ed.setConstraintRank(true);
					ed.setNodeA(editor.getNodeByName(pc.getName() + e.getName()));
					ed.setNodeB(n);
					g.getElements().add(ed);
				}
			}

			// permission operation -> object
			if (e instanceof PermissionImpl) {
				for (Operation o : ((Permission) e).getOperations()) {
					for (policy.Object ob : o.getObjects()) {
						Edge edge = factory.createEdge();
						edge.setName(pc.getName() + e.getName() + ob.getName());
						edge.setColor("black");
						edge.setStyle("solid");
						edge.setConstraintRank(true);
						edge.setNodeA(editor.getNodeByName(pc.getName()
								+ e.getName() + o.getName()));
						edge.setNodeB(editor.getNodeByName(pc.getName()
								+ ob.getName()));
						g.getElements().add(edge);

					}
				}
			}
		}
	}
}