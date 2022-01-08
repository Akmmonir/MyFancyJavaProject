package myfancyjavaproject;

class TestClass {
    private static TestClass tc;
}
private TestClass (int id, String name)
{
    this.id = id;
    this.name = name;
}
public static getTC (int id, String name)
{
    if (tc == null)
    {
        tc = new TestClass(id, name);
        return tc;
    }
}