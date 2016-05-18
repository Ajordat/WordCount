package tad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import logic.Word;

public class AVLTree extends BTree {

	public AVLTree(){
		tree = null;
	}
	
	public AVLTree(NodeB node){
		tree = node;
		node.getElement().increaseValue();
	}
	
	private NodeB rotationLL(NodeB node){
		NodeB aux = node.left;
		node.left = aux.right;
		aux.right = node;
		return aux;
	}
	
	private NodeB rotationRR(NodeB node){
		NodeB aux = node.right;
		node.right = aux.left;
		aux.left = node;		
		return aux;
	}
	
	private NodeB rotationLR(NodeB node){
		node.left = rotationRR(node.left);
		node = rotationLL(node);
		return node;
	}
	
	private NodeB rotationRL(NodeB node){
		node.right = rotationLL(node.right);
		node = rotationRR(node);
		return node;
	}

	@Override
	public Element getValue(String key) {
		return tree.getValue(key);
	}

	@Override
	public void addWord(Element e) {
		if(tree == null){
			tree = new NodeB(e);
			tree.e.increaseValue();
			size++;
		}
		else tree = addWord(tree, e);
	}
	
	public void addValue(Element e) {
		if(tree == null){
			tree = new NodeB(e);
			tree.e.increaseValue();
			size++;
		}
		else tree = addValue(tree, e);
	}
	
	public int height(NodeB node){
		if(node == null) return 0;
		return node.height();
	}
	
	private NodeB addValue(NodeB node, Element element){
		System.out.print(element);
		System.out.print(node.e);
		if(element.compareTo(((Word)node.e).getValue()) < 0){
			System.out.println("-1\n");
			if(node.left == null){
				node.left = new NodeB(element);
				size++;
			}
			else{
				node.left = addValue(node.left, element);
			}
			if(height(node.left) - height(node.right) > 1){
				if(element.compareTo(((Word)node.left.e).getValue()) < 0){
					node = rotationLL(node);
				}else{
					node = rotationLR(node);
				}
			}
		}
		else if(element.compareTo(((Word)node.e).getValue()) >= 0){
			System.out.println("1\n");
			if(node.right == null){
				node.right = new NodeB(element);
				size++;
			}
			else{
				node.right = addValue(node.right, element);
			}
			if(height(node.left) - height(node.right) < -1){
				if(element.compareTo(((Word)node.right.e).getValue()) > 0){
					node = rotationRR(node);
				}else{
					node = rotationRL(node);
				}
			}
		}
		return node;
	}
	
	private NodeB addWord(NodeB node, Element element){
		if(element.compareTo(node.e) <	0){
			if(node.left == null){
				node.left = new NodeB(element);
				node.left.e.increaseValue();
				size++;
			}
			else{
				node.left = addWord(node.left, element);
			}
			if(height(node.left) - height(node.right) > 1){
				if(element.compareTo(node.left.e) < 0){
					node = rotationLL(node);
				}else{
					node = rotationLR(node);
				}
			}
		}
		else if(element.compareTo(node.e) > 0){
			if(node.right == null){
				node.right = new NodeB(element);
				node.right.e.increaseValue();
				size++;
			}
			else{
				node.right = addWord(node.right, element);
			}
			if(height(node.left) - height(node.right) < -1){
				if(element.compareTo(node.right.e) > 0){
					node = rotationRR(node);
				}else{
					node = rotationRL(node);
				}
			}
		}
		else node.e.increaseValue();
		return node;
	}
	
	public void remove(String key){
		tree = remove(tree, key);
	}
	
	private NodeB remove(NodeB node, String key){
		if(node.e.compareTo(key) > 0){
			if(node.left != null) node.left = remove(node.left, key);
			if(height(node.left) - height(node.right) > 1){
				//Rotacions
			}
		}
		else if(node.e.compareTo(key) < 0){
			if(node.right != null) node.right = remove(node.right, key);
			if(height(node.left) - height(node.right) < -1){
				//Rotacions
			}
		}
		else{
			if(node.left != null){
				node.e = node.left.last();
				node.left = removeLast(node.left);
			}
			else{
				node = node.right;
			}
		}
		return node;
	}
	
	private NodeB removeLast(NodeB node) {
		if(node.right == null) return node.left;
		node.right = removeLast(node.right);
		if(height(node.left) - height(node.right) < -1){
			//Rotacions
		}
		return node;
	}
	
	@Override
	public void loadFile(String fileName){
		try {
			Scanner file = new Scanner(new FileReader(fileName));
			while(file.hasNext()){
				String line = file.nextLine();
				Scanner scanner = new Scanner(line.replaceAll("[^a-z^A-Z\\s]", "").toLowerCase());
				while(scanner.hasNext()){
					addWord(new Word(scanner.next()));
				}
				scanner.close();
			}
			file.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		}
	}

	public void copia(AVLTree t){
		if(tree != null) extreu(t,tree);
	}
	
	private void extreu (AVLTree t, NodeB node){
		if(node.left != null) extreu(t, node.left);
		t.addValue(node.e);
		if(node.right != null) extreu(t, node.right);
	}

}
