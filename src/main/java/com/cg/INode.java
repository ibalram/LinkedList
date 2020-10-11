package com.cg;

public interface INode<T> {
	T getKey();

	void setKey(T a);

	INode getNext();

	void setNext(INode a);
}
