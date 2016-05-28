package tad;

import logic.Word;

public class NodeSearch extends NodeB{
	
	public NodeSearch(Element e){
		super(e);
	}
	
	public int addWord(Element element){
		if(element.compareTo(e) < 0){
			if(left == null){
				left = new NodeSearch(element);
				left.getElement().increaseValue();
				return 1;
			}
			return ((NodeSearch) left).addWord(element);
		}
		else if (element.compareTo(e) > 0){
			if(right == null){
				right = new NodeSearch(element);
				right.getElement().increaseValue();
				return 1;
			}
			return ((NodeSearch) right).addWord(element);
		}
		else e.increaseValue();
		return 0;
	}
	
	public int addValue(Element element){
		if(element.compareTo(((Word)e).getValue()) > 0){
			if(left == null){
				left = new NodeSearch(element);
				return 1;
			}
			return ((NodeSearch) left).addValue(element);
		}
		else if (element.compareTo(((Word)e).getValue()) <= 0){
			if(right == null){
				right = new NodeSearch(element);
				return 1;
			}
			return ((NodeSearch) right).addValue(element);
		}
		else e.increaseValue();
		return 0;
	}
}
