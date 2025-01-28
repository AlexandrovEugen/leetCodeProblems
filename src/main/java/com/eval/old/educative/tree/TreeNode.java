package com.eval.old.educative.tree;

import lombok.EqualsAndHashCode;

// Definiton o
// f a binary tree node class
@EqualsAndHashCode
 public class TreeNode<T> {
     public T data;
     public TreeNode<T> left;
     public TreeNode<T> right;

     public TreeNode(T data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }
