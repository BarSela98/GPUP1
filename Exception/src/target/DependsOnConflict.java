package target;

public class DependsOnConflict extends TargetException {

    public DependsOnConflict(String nameOne , String nameTwo){
        super(nameOne , nameTwo);
    }

    @Override
    public String toString(){
        return super.toString() + super.targetOne + "dependsOn " + super.targetTwo +
                " then " + super.targetTwo + "can’t be dependsOn " + super.targetOne +"\n\r";
    }
}
