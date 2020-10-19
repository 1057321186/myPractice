package com.project.arithmetic;

import java.util.ArrayList;
import java.util.List;

public class Node {
	/*
	 * 二叉树由各种节点组成 二叉树特点： 每个节点都可以有左子节点， 右子节点 每一个节点都有一个值
	 */

	// 左子节点
	public Node leftNode;
	// 右子节点
	public Node rightNode;
	// 值
	public Object value;

	public static void main(String[] args) {
		//要插入的值
		int arr[] = { 10, 5, 18, 30, 21, 36, 0, 48 };
		Node node = new Node();
		// 遍历插入值
		for (int a : arr) {
			node.add(a);
		}
		System.out.println(node.bianLi());
	}

	// 二叉排序(插入基本逻辑是，小、相同的放左边，大的放右边)
	// 插入数据(插入数据的过程中已经排好序)
	public void add(Object v) {
		// 如果当前节点没有值，则就把数据放到当前节点
		if (null == value) {
			value = v;
		}
		// 如果当前节点有值，就行判断，新增的值与当前值的大小
		else {
			if ((Integer) v - ((Integer) value) <= 0) {
				// 如果左子节点为空,就把值放到当前左子节点
				if (null == leftNode) {
					leftNode = new Node();
				}
				// 递归
				leftNode.add(v);

			}
			// 新增的值，比当前值小
			else {
				if (null == rightNode) {
					rightNode = new Node();
				}
				// 递归
				rightNode.add(v);

			}
		}

	}

	// 遍历二叉树
	/*
	 * 先序后序中序遍历 按从小打大，则选择中序遍历
	 */
	public List<Object> bianLi() {
		//创建一个list对象
		List<Object> valuesList = new ArrayList<>();
		// 左节点遍历结果
		if (null != leftNode) {
			// 递归获取所有的左节点值
			valuesList.addAll(leftNode.bianLi());
		}
		// 当前根节点
		valuesList.add(value);

		// 右节点遍历结果
		if (null != rightNode) {
			// 递归获取所有的右节点值
			valuesList.addAll(rightNode.bianLi());
		}
		return valuesList;
	}
}
