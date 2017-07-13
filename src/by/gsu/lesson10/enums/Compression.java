package by.gsu.lesson10.enums;

public enum Compression {
    ZIP {
        @Override
        byte[] compress(byte[] input) {
            return new byte[0];
        }
    },
    RAR {
        @Override
        byte[] compress(byte[] input) {
            return new byte[0];
        }
    };

    abstract byte[] compress(byte[] input);
}
