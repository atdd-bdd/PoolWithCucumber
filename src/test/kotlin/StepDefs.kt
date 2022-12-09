

import io.cucumber.datatable.DataTable
import io.cucumber.java8.En
import io.cucumber.java8.PendingException
import skeleton.Belly
data class Input(val value: String?)

class StepDefs: En {

    init {
        Given("^I have (\\d+) cukes in my belly$") { cukes: Int ->
            val belly = Belly()
            belly.eat(cukes)
        }

        When("^I wait (\\d+) hour$") { arg1: Int ->
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }

        Then("^my belly should growl$") {
            // Write code here that turns the phrase above into concrete actions
            throw PendingException()
        }
        DataTableType { entry: Map<String, String> ->
            Input(entry["Hour"])
        }
        When(
            "I wait"
        ) { dataTable: DataTable? -> val list: List<Input> = dataTable!!.asList(Input::class.java)
            for (p in list) {
                println(p.value)
            } }

    }
}