package accessmodifiers;

public class Child extends Parent{
    @Override
    protected void defaultMethod() { // protected or public
        super.defaultMethod();
    }

    @Override
    public void protectedMethod() { // or public
        super.protectedMethod();
    }

    @Override
    public void publicMethod() {
        super.publicMethod();
    }
}
