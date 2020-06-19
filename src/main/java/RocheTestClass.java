public class RocheTestClass {

    public static boolean returnBoolean(String boolType){

        if (boolType.equals("true")){
            return true;
        } else {
            return false;
        }
    }

    public static Object returnObject(String stringType){
        if (stringType.equals("")){
            return null;
        }else{
            return stringType;
        }

    }

    public static int[] returnArray(){
        return new int[]{1, 2, 3};
    }

    public static void returnException() throws CustomException {
        throw new CustomException();
    }

}

