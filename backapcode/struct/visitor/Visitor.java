package org.safari.struct.visitor;

import org.safari.struct.CompositeAddNode;
import org.safari.struct.CompositeDivideNode;
import org.safari.struct.CompositeMultiplayNode;
import org.safari.struct.CompositeNegativeNode;
import org.safari.struct.CompositeSubtractNode;
import org.safari.struct.LeafNode;

public interface Visitor {

	void visit(LeafNode leafNode);

	void visit(CompositeNegativeNode compositeNegativeNode);

	void visit(CompositeDivideNode compositeDivideNode);

	void visit(CompositeMultiplayNode compositeMultiplayNode);

	void visit(CompositeSubtractNode compositeSubtractNode);

	void visit(CompositeAddNode compositeAddNode);

}
