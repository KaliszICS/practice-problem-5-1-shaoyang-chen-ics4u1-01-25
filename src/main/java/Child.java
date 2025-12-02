public class Child extends Person  {
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;
    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];
    }
    public Parent getParent1() {
        return parent1;
    }
    public Parent getParent2() {
        return parent2;
    }
    public Child[] getSiblings() {
        return siblings;
    }
    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }
    public void addSibling(Child sibling) {
        if (sibling == null || sibling == this) {
            return;
        }
        for (Child child : siblings) {
            if (child == sibling) {
                return;
            }
        }
        Child[] newSiblings = new Child[siblings.length + 1];
        System.arraycopy(siblings, 0, newSiblings, 0, siblings.length);
        newSiblings[siblings.length] = sibling;
        siblings = newSiblings;
    }

}
