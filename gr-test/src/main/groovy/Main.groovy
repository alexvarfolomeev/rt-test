static void main(String[] args) {
  def list = [1, 3, 4, 5, 1, 5, 4];
  def m = elementsCount(list)
  m.each {e -> println "$e.key : $e.value"}
}

static def HashMap<Integer, Integer> elementsCount(List<Integer> integers) {
  def map = [:]
  for (Integer element : integers) {
    map.put(element, map.getOrDefault(element, 0) + 1)
  }
  return map as HashMap<Integer, Integer>
}