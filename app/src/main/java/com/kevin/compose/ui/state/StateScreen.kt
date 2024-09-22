//package com.kevin.compose.ui.state
//
//class CounterActivity : AppCompatActivity() {
//    private var count = 0
//    private lateinit var textView: TextView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_counter)
//
//        textView = findViewById(R.id.countTextView)
//        val button = findViewById<Button>(R.id.incrementButton)
//
//        button.setOnClickListener {
//            count++
//            textView.text = count.toString()
//        }
//    }
//}
//
//
//
//@Composable
//fun Counter() {
//    var count by remember { mutableStateOf(0) }
//
//    Column {
//        Text(text = "Count: $count")
//        Button(onClick = { count++ }) {
//            Text("Increment")
//        }
//    }
//}
