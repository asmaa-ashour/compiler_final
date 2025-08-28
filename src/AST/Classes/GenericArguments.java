package AST.Classes;

public class GenericArguments {
    /*

genericArguments
    : LT genericTypeList GT
    ;
     */
    private  String LT;
    private  String GT;
    private GenericTypeList genericTypeList;

    public String getLT() {
        return LT;
    }

    public void setLT(String LT) {
        this.LT = LT;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public GenericTypeList getGenericTypeList() {
        return genericTypeList;
    }

    public void setGenericTypeList(GenericTypeList genericTypeList) {
        this.genericTypeList = genericTypeList;
    }

    @Override
    public String toString() {
        return "GenericArguments{" +
                 LT + '\'' +
                 genericTypeList +
                 GT + '\'' +

                '}';
    }
}
