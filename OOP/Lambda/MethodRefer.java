@FunctionalInterface
interface Converter {
  Integer Convert(String from);
}

Converter converter1 = from -> Integer.valueOf(from);
Integer val = converter1.Convert("99");
