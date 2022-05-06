package visitor.element;

import visitor.visitor.BuildingVisitor;

public interface Element {
    void accept(BuildingVisitor visitor);
}
