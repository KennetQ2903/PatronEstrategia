package error;

public enum Errors {
    TYPE_ERROR,
    UNKNOWN_ERROR,
    GENERIC_ERROR,
    COMPILATION_ERROR,
    ;

    @Override
    public String toString() {

        switch (this) {
            case TYPE_ERROR:
                return "Type Error";
            case UNKNOWN_ERROR:
                return "Unknown Error";
            case GENERIC_ERROR:
                return "Generic Error";
            case COMPILATION_ERROR:
                return "Compilation Error";
        }
        return "";
    }
}
