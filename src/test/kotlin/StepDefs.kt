

import io.cucumber.datatable.DataTable
import io.cucumber.java8.En
import io.cucumber.java8.PendingException
import skeleton.Belly
data class Input(val value: String?)

class StepDefs: En {

    init {
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