/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package grapho.impl;

import grapho.Edge;
import grapho.GraphoPackage;
import grapho.Node;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link grapho.impl.EdgeImpl#getNodeA <em>Node A</em>}</li>
 *   <li>{@link grapho.impl.EdgeImpl#getNodeB <em>Node B</em>}</li>
 *   <li>{@link grapho.impl.EdgeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link grapho.impl.EdgeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link grapho.impl.EdgeImpl#isConstraintRank <em>Constraint Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends GraphElementImpl implements Edge {
	/**
	 * The cached value of the '{@link #getNodeA() <em>Node A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeA()
	 * @generated
	 * @ordered
	 */
	protected Node nodeA;

	/**
	 * The cached value of the '{@link #getNodeB() <em>Node B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeB()
	 * @generated
	 * @ordered
	 */
	protected Node nodeB;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstraintRank() <em>Constraint Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraintRank()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINT_RANK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstraintRank() <em>Constraint Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstraintRank()
	 * @generated
	 * @ordered
	 */
	protected boolean constraintRank = CONSTRAINT_RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphoPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeA() {
		if (nodeA != null && nodeA.eIsProxy()) {
			InternalEObject oldNodeA = (InternalEObject)nodeA;
			nodeA = (Node)eResolveProxy(oldNodeA);
			if (nodeA != oldNodeA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphoPackage.EDGE__NODE_A, oldNodeA, nodeA));
			}
		}
		return nodeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeA() {
		return nodeA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeA(Node newNodeA) {
		Node oldNodeA = nodeA;
		nodeA = newNodeA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphoPackage.EDGE__NODE_A, oldNodeA, nodeA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeB() {
		if (nodeB != null && nodeB.eIsProxy()) {
			InternalEObject oldNodeB = (InternalEObject)nodeB;
			nodeB = (Node)eResolveProxy(oldNodeB);
			if (nodeB != oldNodeB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphoPackage.EDGE__NODE_B, oldNodeB, nodeB));
			}
		}
		return nodeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeB() {
		return nodeB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeB(Node newNodeB) {
		Node oldNodeB = nodeB;
		nodeB = newNodeB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphoPackage.EDGE__NODE_B, oldNodeB, nodeB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphoPackage.EDGE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphoPackage.EDGE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstraintRank() {
		return constraintRank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRank(boolean newConstraintRank) {
		boolean oldConstraintRank = constraintRank;
		constraintRank = newConstraintRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphoPackage.EDGE__CONSTRAINT_RANK, oldConstraintRank, constraintRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphoPackage.EDGE__NODE_A:
				if (resolve) return getNodeA();
				return basicGetNodeA();
			case GraphoPackage.EDGE__NODE_B:
				if (resolve) return getNodeB();
				return basicGetNodeB();
			case GraphoPackage.EDGE__COLOR:
				return getColor();
			case GraphoPackage.EDGE__STYLE:
				return getStyle();
			case GraphoPackage.EDGE__CONSTRAINT_RANK:
				return isConstraintRank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphoPackage.EDGE__NODE_A:
				setNodeA((Node)newValue);
				return;
			case GraphoPackage.EDGE__NODE_B:
				setNodeB((Node)newValue);
				return;
			case GraphoPackage.EDGE__COLOR:
				setColor((String)newValue);
				return;
			case GraphoPackage.EDGE__STYLE:
				setStyle((String)newValue);
				return;
			case GraphoPackage.EDGE__CONSTRAINT_RANK:
				setConstraintRank((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphoPackage.EDGE__NODE_A:
				setNodeA((Node)null);
				return;
			case GraphoPackage.EDGE__NODE_B:
				setNodeB((Node)null);
				return;
			case GraphoPackage.EDGE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GraphoPackage.EDGE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case GraphoPackage.EDGE__CONSTRAINT_RANK:
				setConstraintRank(CONSTRAINT_RANK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphoPackage.EDGE__NODE_A:
				return nodeA != null;
			case GraphoPackage.EDGE__NODE_B:
				return nodeB != null;
			case GraphoPackage.EDGE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case GraphoPackage.EDGE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case GraphoPackage.EDGE__CONSTRAINT_RANK:
				return constraintRank != CONSTRAINT_RANK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", style: ");
		result.append(style);
		result.append(", constraintRank: ");
		result.append(constraintRank);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
