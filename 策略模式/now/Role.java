package now;

public abstract class Role {

    protected String name;

    protected IDefendBehavior defendBehavior;

    protected IDisplayBehavior displayBehavior;

    protected IRunBehavior runBehavior;

    protected IAttackBehavior attackBehavior;

    public Role setDefendBehavior(IDefendBehavior defendBehavior){
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior){
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setIRunBehavior(IRunBehavior runBehavior){
        this.runBehavior = runBehavior;
        return this;
    }

    public Role setIAttackBehavior(IAttackBehavior attackBehavior){
        this.attackBehavior = attackBehavior;
        return this;
    }

    protected void display(){
        displayBehavior.display();
    }

    protected void run(){
        runBehavior.run();
    }

    protected void attack(){
        attackBehavior.attack();
    }

    protected void defend(){
        defendBehavior.defend();
    }
}
