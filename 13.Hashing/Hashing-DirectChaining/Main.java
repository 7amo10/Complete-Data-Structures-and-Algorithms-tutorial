class Main {
  public static void main(String[] args) {
    DirectChaining directChaining = new DirectChaining(13);
    directChaining.insertHashTable("The");
    directChaining.insertHashTable("quick");
    directChaining.insertHashTable("brown");
    directChaining.insertHashTable("fox");
    directChaining.insertHashTable("over");
	  directChaining.deleteKeyHashTable("ox");
    directChaining.displayHashTable();

  }
}