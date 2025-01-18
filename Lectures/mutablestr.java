public class mutablestr {
    public static void main(String[] args) {
        StringBuilder strbui1 = new StringBuilder("BCA ");
        StringBuilder strbui2 = new StringBuilder(" PU");
        StringBuffer strbuf1 = new StringBuffer("Bca ");
        StringBuffer strbuf2 = new StringBuffer(" Pu");
        System.out.println("strbuf1 => "+strbuf1);
        System.out.println("strbuf2 => "+strbuf2);
        System.out.println("strbui1 => "+strbui1);
        System.out.println("strbui2 => "+strbui2);
        strbuf1.append(strbuf2);
        System.out.println("After appending strbuf2 to strbuf1 => "+strbuf1);
        strbui1.append(strbui2);
        System.out.println("After appending strbui2 to strbui1 => "+strbui1);
        strbuf1.append(strbui2);
        System.out.println("After appending strbui2 to strbuf1 => "+strbuf1);
        strbui1.append(strbuf2);
        System.out.println("After appending strbuf2 to strbui1 => "+strbui1);
        strbuf1.insert(3," Psc ");
        System.out.println("Inserting Psc after Bca in strbuf1 => "+strbuf1);
        strbui1.insert(3," PSC ");
        System.out.println("Inserting PSC after BCA in strbui1 => "+strbui1);
        strbuf1.setCharAt(3,',' );
        System.out.println("Inserting \",\" with setCharAt in strbuf1 => "+strbuf1);
        strbui1.setCharAt(3,',' );
        System.out.println("Inserting \",\" with setCharAt in strbui1 => "+strbui1);
        strbuf1.setLength(7);
        System.out.println("Using setLenth 7 in strbuf1 => "+strbuf1);
        strbui1.setLength(7);
        System.out.println("Using setLenth 7 in strbui1 => "+strbui1);
        System.out.println("Comparing strbuf1 with strbui1 with equals => "+strbuf1.equals(strbui1));
    }
}
