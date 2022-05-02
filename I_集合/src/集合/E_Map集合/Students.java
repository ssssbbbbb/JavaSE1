package 集合.E_Map集合;
/**
 * 测试用的Students类
 */
public class Students implements Comparable<Students>{
    private String name;
    private int id;

    public Students(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return this.name+"-----"+id;
    }

    @Override
    public int hashCode() {
        int result = 0;
        return name == null ? 0 : this.id+name.hashCode();
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + id;
//        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int compareTo(Students o) {
        return this.id - o.getId();
    }
}
