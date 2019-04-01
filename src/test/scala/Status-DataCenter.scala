package MailQueueTest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class StatusDataCenter extends Simulation {

  val httpProtocol = http
    .baseUrl("http://jira-jira-loadbala-lik9d5hti7os-1380259209.eu-west-1.elb.amazonaws.com")

  val scn = scenario("Status")
    .exec(http("status")
      .get("/rest/mailqueue/1.0/status"))

  setUp(scn.inject(constantUsersPerSec(1) during (1 minute)).protocols(httpProtocol))
}
