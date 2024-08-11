class Main {
  public static void main(String[] args) {
    DoubleHashing doubleHashing = new DoubleHashing(13);
    doubleHashing.insertKeyInHashTable("The");
		doubleHashing.insertKeyInHashTable("quick");
		doubleHashing.insertKeyInHashTable("brown");
		doubleHashing.insertKeyInHashTable("fox");
		doubleHashing.insertKeyInHashTable("over");
		doubleHashing.insertKeyInHashTable("lazy");
		doubleHashing.displayHashTable();

  
  }
}