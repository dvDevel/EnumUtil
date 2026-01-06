package enumutil.types;

public class EnumUtil {

    // Generic method that only accepts Enums that implement HasCode
    public static <T extends Enum<T> & HashCode> T getConstantByCode(Class<T> enumClass, String name) {
        for (T constant : enumClass.getEnumConstants()) {
            if (constant.getName() == name) {
                return constant;
            }
        }
        return null;
    }

    public static <T extends Enum<T> & HashCode> int getHashCodeByCode(Class<T> enumClass, String name) {
        for (T constant : enumClass.getEnumConstants()) {
            if (constant.getName() == name) {
                return constant.hashCode();
            }
        }
        return -1; 
    }

}
