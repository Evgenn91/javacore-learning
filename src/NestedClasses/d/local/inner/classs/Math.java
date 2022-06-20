package NestedClasses.d.local.inner.classs;

public class Math {
    public void getResult(int delimoe, int delitel){ // эти значения менять нельзя!!!(можно поставить final рядом с ними)

//        final int delimoe = 21;
        //delimoe = 22; так уже нельзя потому что используем эту переменную в локал внутр классе

        class Delenie{
//            private int delitel;

//            public int getDelimoe() { return delimoe; }
//            public void setDelimoe(int delimoe) { this.delimoe = delimoe; }
//            public int getDelitel() { return delitel; }
//            public void setDelitel(int delitel) { this.delitel = delitel; }
//            public void setDelitel(int delitel) { delitel = delitel; }

            public int getChastnoe(){ return delimoe/delitel; }
            public int getOstatok(){ return delimoe%delitel; }
        }


        Delenie del = new Delenie();
//        del.setDelitel(4);
        System.out.println("delChastn = " + del.getChastnoe());
        System.out.println("delOstat = " + del.getOstatok());
    }
}
