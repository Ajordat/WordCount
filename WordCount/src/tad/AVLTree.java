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
	
	public NodeB rotationLL(NodeB node){
		NodeB aux = node.left;
		node.left = aux.right;
		aux.right = node;
		return aux;
	}
	
	public NodeB rotationRR(NodeB node){
		NodeB aux = node.right;
		node.right = aux.left;
		aux.left = node;		
		return aux;
	}
	
	public NodeB rotationLR(NodeB node){
		node.left = rotationRR(node.left);
		node = rotationLL(node);
		return node;
	}
	
	public NodeB rotationRL(NodeB node){
		node.right = rotationLL(node.right);
		node = rotationRR(node);
		return node;
	}

	@Override
	public Element getValue(String key) {
		return tree.getValue(key);
	}

	@Override
	public void add(Element e) {
		if(tree == null){
			tree = new NodeB(e);
			tree.e.increaseValue();
			size++;
		}
		else tree = insert(tree, e);
	}
	
	public int height(NodeB node){
		if(node == null) return 0;
		return node.height();
	}
	
	private NodeB insert(NodeB node, Element element){
		if(element.compareTo(node.e) <	0){
			if(node.left == null){
				node.left = new NodeB(element);
				node.left.e.increaseValue();
				size++;
			}
			else{
				node.left = insert(node.left, element);
			}
			int hLeft = height(node.left);
			int hRight = height(node.right);
			if(hLeft - hRight > 1){
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
				node.right = insert(node.right, element);
			}
			int hLeft = height(node.left);
			int hRight = height(node.right);
			if(hLeft - hRight < -1){
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
		}
		else if(node.e.compareTo(key) < 0){
			if(node.right != null) node.right = remove(node.right, key);
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
					add(new Word(scanner.next()));
					size++;
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

}
