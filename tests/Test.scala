object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(55, 93, 25, 7, 4)
    assert(Policy.score(signalcase_1) == 106)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(87, 96, 21, 8, 10)
    assert(Policy.score(signalcase_2) == 209)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(103, 76, 24, 25, 7)
    assert(Policy.score(signalcase_3) == 95)
    assert(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(65, 49, 21, 93)
    assert(DomainReviewLens.score(domainReview) == 209)
    assert(DomainReviewLens.lane(domainReview) == "ship")
  }
}
