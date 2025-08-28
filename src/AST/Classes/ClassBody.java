package AST.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassBody {
    /*
    classBody
    : classElement*
    ;
     */
    private List<ClassElement>classElement=new ArrayList<>();

    public List<ClassElement> getClassElement() {
        return classElement;
    }

    public void setClassElement(List<ClassElement> classElement) {
        this.classElement = classElement;
    }

    @Override
    public String toString() {
        if(classElement != null)
        return "ClassBody{" +
                 classElement +
                '}';
        return "ClassBody{" +
             '.'+
                '}';
    }
}
