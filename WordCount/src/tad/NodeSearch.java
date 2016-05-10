package tad;

public class NodeSearch extends NodeB{
	
	public NodeSearch(Element e){
		super(e);
	}
	
	public void add(Element element){
		if(element.compareTo(e) < 0){
			if(left == null){
				left = new NodeSearch(element);
				left.getElement().increaseValue();
			}
			else ((NodeSearch) left).add(element);
		}
		else if (element.compareTo(e) > 0){
			if(right == null){
				right = new NodeSearch(element);
				right.getElement().increaseValue();
			}
			else ((NodeSearch) right).add(element);
		}
		else e.increaseValue();
	}
	
}
