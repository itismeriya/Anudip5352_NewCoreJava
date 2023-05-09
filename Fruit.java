class TestQuestion {

private int var1;

private int var2;

public void setVar1(int i) {

this.var1 = i;

}

public int getVar1() {

return this.var1;

}

public void setVar2(int i) {

this.var2 = i;

}

public int getVar2() {

return this.var2;

}

public boolean equals(Object obj) {

return (obj instanceof TestQuestion && this.var1 == ((TestQuestion)

obj).var1);

}

public int hashCode( )

{

//insert code

}