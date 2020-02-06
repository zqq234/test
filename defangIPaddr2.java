class defangIPaddr2 {
    public String defangIPaddr(String address) {
        String[] splits = address.split("\\.");
        StringBuffer stringBuffer = new StringBuffer();
        for (String split : splits) {
            stringBuffer.append(split + "[.]");
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 3);
    }
}
