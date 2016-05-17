package tad;

public class NodeSearch extends NodeB{
	
	public NodeSearch(Element e){
		super(e);
	}
	
	public int add(Element element){
		if(element.compareTo(e) < 0){
			if(left == null){
				left = new NodeSearch(element);
				left.getElement().increaseValue();
				return 1;
			}
			else ((NodeSearch) left).add(element);
		}
		else if (element.compareTo(e) > 0){
			if(right == null){
				right = new NodeSearch(element);
				right.getElement().increaseValue();
				return 1;
			}
			else ((NodeSearch) right).add(element);
		}
		else e.increaseValue();
		return 0;
	}
	
}
