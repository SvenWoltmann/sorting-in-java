package eu.happycoders.sort.method.heapsort;

class BottomUpBuildHeapAndSiftDownTest extends BuildHeapAndSiftDownTest {

  @Override
  protected Heapsort getSortAlgorithm() {
    return new BottomUpHeapsort();
  }
}
