<div tabindex="-1" id="notebook" class="border-box-sizing">

<div class="container" id="notebook-container">

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [3]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Control Structures</span>
<span class="k">val</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">16</span>

<span class="k">if</span><span class="o">(</span> <span class="n">age</span> <span class="o">></span> <span class="mi">18</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Allowed to Vote!"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Not Allowed to Vote"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Not Allowed to Vote
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[3]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">age</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">16</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [6]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">45</span>
<span class="k">if</span><span class="o">(</span><span class="n">age</span> <span class="o"><=</span> <span class="mi">16</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Younger"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">age</span> <span class="o">></span> <span class="mi">16</span> <span class="o">&&</span> <span class="n">age</span> <span class="o"><=</span><span class="mi">40</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Middle Age"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Older"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Older
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[6]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">age</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">45</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [6]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="mi">30</span>
<span class="k">val</span> <span class="n">younger</span> <span class="k">=</span> <span class="s">"Younger"</span>
<span class="k">val</span> <span class="n">old</span> <span class="k">=</span> <span class="s">"Old"</span>
<span class="k">val</span> <span class="n">ageGroup</span> <span class="k">=</span> <span class="n">age</span> <span class="o">==</span> <span class="mi">35</span> <span class="o">?</span> <span class="n">old</span> <span class="k">:</span> <span class="kt">younger</span>
<span class="n">println</span><span class="o">(</span><span class="n">ageGroup</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stderr output_text">

<pre>cmd6.sc:4: not found: type younger
val ageGroup = age == 35 ? old : younger
                                 ^cmd6.sc:4: value ? is not a member of Int
val ageGroup = age == 35 ? old : younger
                         ^</pre>

</div>

</div>

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre>Compilation Failed</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [7]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">marks</span> <span class="k">=</span> <span class="mi">50</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[7]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">marks</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">50</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [9]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">if</span><span class="o">(</span><span class="n">marks</span> <span class="o">==</span> <span class="mi">35</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Pass"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">marks</span> <span class="o">></span><span class="mi">35</span> <span class="o">&&</span> <span class="n">marks</span> <span class="o"><=</span> <span class="mi">60</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Second Class"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">marks</span> <span class="o">></span> <span class="mi">60</span> <span class="o">&&</span> <span class="n">marks</span> <span class="o"><=</span> <span class="mi">70</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"First Class"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span> <span class="k">if</span><span class="o">(</span><span class="n">marks</span> <span class="o">></span> <span class="mi">70</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Distinction"</span><span class="o">)</span>
<span class="o">}</span><span class="k">else</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Fail"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Second Class
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [17]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">marks</span> <span class="k">=</span> <span class="mi">50</span>

<span class="k">val</span> <span class="n">pass</span> <span class="k">=</span> <span class="mi">35</span>
<span class="k">val</span> <span class="n">second</span> <span class="k">=</span> 

<span class="k">val</span> <span class="n">result</span> <span class="k">=</span> <span class="n">marks</span> <span class="k">match</span><span class="o">{</span>
    <span class="k">case</span>  <span class="n">pass</span> <span class="k">=></span> <span class="o">(</span><span class="s">"Pass"</span><span class="o">)</span>
    <span class="k">case</span>  <span class="mi">50</span> <span class="k">=></span> <span class="o">(</span><span class="s">"Second Class"</span><span class="o">)</span>
    <span class="k">case</span>  <span class="mi">60</span> <span class="k">=></span> <span class="o">(</span><span class="s">"First Class"</span><span class="o">)</span>
    <span class="k">case</span>  <span class="mi">70</span> <span class="k">=></span> <span class="o">(</span><span class="s">"Distinction"</span><span class="o">)</span>
    <span class="k">case</span>  <span class="k">_</span> <span class="k">=></span>  <span class="o">(</span><span class="s">"Fail"</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[17]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">marks</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">50</span>
<span class="ansi-cyan-fg">result</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"Second Class"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [18]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">var</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">0</span>
<span class="k">while</span><span class="o">(</span><span class="n">a</span>  <span class="o"><=</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">a</span><span class="o">)</span>
    <span class="n">a</span> <span class="k">=</span> <span class="n">a</span> <span class="o">+</span> <span class="mi">1</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
1
2
3
4
5
6
7
8
9
10
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[18]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">11</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [22]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">a</span> <span class="k">=</span> <span class="mi">10</span>
<span class="k">do</span><span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="n">a</span><span class="o">)</span>
    <span class="n">a</span> <span class="k">=</span> <span class="n">a</span> <span class="o">+</span> <span class="mi">1</span>
<span class="o">}</span><span class="k">while</span><span class="o">(</span><span class="n">a</span> <span class="o"><</span> <span class="mi">12</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>10
11
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [23]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"ravi"</span><span class="o">,</span> <span class="s">"hari"</span><span class="o">,</span> <span class="s">"siva"</span><span class="o">)</span>
<span class="k">for</span><span class="o">(</span><span class="n">name</span> <span class="k"><-</span> <span class="n">names</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>ravi
hari
siva
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[23]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">"hari"</span>, <span class="ansi-green-fg">"siva"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [24]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"ravi"</span><span class="o">,</span> <span class="s">"hari"</span><span class="o">,</span> <span class="s">"siva"</span><span class="o">)</span>
<span class="k">for</span><span class="o">(</span><span class="n">name</span> <span class="k"><-</span> <span class="n">names</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>ravi
hari
siva
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[24]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">"hari"</span>, <span class="ansi-green-fg">"siva"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [25]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">to</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
1
2
3
4
5
6
7
8
9
10
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [26]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">until</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
1
2
3
4
5
6
7
8
9
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [27]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">6</span><span class="o">)</span>
<span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="n">numbers</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>1
2
3
4
5
6
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[27]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [28]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span><span class="o">.</span><span class="n">foreach</span><span class="o">(</span><span class="n">println</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>1
2
3
4
5
6
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [29]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span><span class="o">.</span><span class="n">foreach</span><span class="o">(</span><span class="n">num</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="n">num</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>1
2
3
4
5
6
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [30]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">names</span><span class="o">.</span><span class="n">foreach</span><span class="o">(</span><span class="n">println</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>ravi
hari
siva
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [31]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">to</span> <span class="mi">10</span> <span class="k">if</span> <span class="n">i</span> <span class="o">%</span> <span class="mi">2</span> <span class="o">==</span> <span class="mi">0</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
2
4
6
8
10
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [32]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">even</span> <span class="k">=</span> <span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">to</span> <span class="mi">10</span> <span class="k">if</span> <span class="n">i</span> <span class="o">%</span> <span class="mi">2</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="k">yield</span> <span class="n">i</span>
<span class="n">even</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[32]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">even</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">immutable</span>.<span class="ansi-green-fg">IndexedSeq</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Vector</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">10</span>)
<span class="ansi-cyan-fg">res31_1</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">immutable</span>.<span class="ansi-green-fg">IndexedSeq</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Vector</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">10</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [33]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">to</span> <span class="mi">10</span> <span class="n">by</span> <span class="mi">3</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">i</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>0
3
6
9
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [ ]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Functions</span>
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [37]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
   <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[37]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [39]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">hai</span><span class="o">()</span> <span class="k">:</span> <span class="kt">Unit</span> <span class="o">=</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">"Hai"</span><span class="o">)</span>
<span class="o">}</span>
<span class="n">hai</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hai
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[39]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">hai</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [40]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">hai</span><span class="o">(</span><span class="n">message</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Unit</span> <span class="o">=</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="n">message</span><span class="o">)</span>
<span class="o">}</span>
<span class="n">hai</span><span class="o">(</span><span class="s">"Scala"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Scala
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[40]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">hai</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [41]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">getNumbers</span><span class="o">()</span> <span class="k">:</span> <span class="kt">Array</span><span class="o">[</span><span class="kt">Int</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
    <span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">)</span>
    <span class="o">(</span><span class="n">numbers</span><span class="o">)</span>
<span class="o">}</span>
<span class="n">getNumbers</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[41]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">getNumbers</span>
<span class="ansi-cyan-fg">res40_1</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [43]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">inc</span> <span class="k">=</span> <span class="o">(</span><span class="n">x</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="n">x</span> <span class="o">+</span> <span class="mi">1</span>
<span class="n">inc</span><span class="o">(</span><span class="mi">20</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[43]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">inc</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1>
<span class="ansi-cyan-fg">res42_1</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">21</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [ ]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">inc</span><span class="o">(</span><span class="n">x</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">x</span> <span class="o">+</span> <span class="mi">1</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [44]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">subAndAdd</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">f</span><span class="k">:</span><span class="o">(</span><span class="kt">Int</span><span class="o">,</span> <span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="nc">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">f</span><span class="o">(</span><span class="n">a</span><span class="o">,</span> <span class="n">b</span><span class="o">)</span>
    <span class="k">val</span> <span class="n">sub</span> <span class="k">=</span> <span class="n">b</span> <span class="o">-</span> <span class="n">a</span>
    <span class="k">val</span> <span class="n">total</span> <span class="k">=</span> <span class="n">sum</span> <span class="o">+</span> <span class="n">sub</span>
    <span class="o">(</span><span class="n">total</span><span class="o">)</span>
<span class="o">}</span>
<span class="k">val</span> <span class="n">total</span> <span class="k">=</span> <span class="n">subAndAdd</span><span class="o">(</span><span class="mi">30</span><span class="o">,</span> <span class="mi">40</span><span class="o">,</span> <span class="n">add</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[44]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">subAndAdd</span>
<span class="ansi-cyan-fg">total</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">80</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [47]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">=</span><span class="mi">10</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">=</span><span class="mi">20</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="n">println</span><span class="o">(</span><span class="s">s"a:</span> <span class="si">$a</span><span class="s">"</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="s">s"b:</span> <span class="si">$b</span><span class="s">"</span><span class="o">)</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>
<span class="n">add</span><span class="o">()</span>
<span class="n">add</span><span class="o">(</span><span class="mi">30</span><span class="o">,</span> <span class="mi">40</span><span class="o">)</span>
<span class="n">add</span><span class="o">(</span><span class="n">b</span><span class="k">=</span><span class="mi">40</span><span class="o">,</span> <span class="n">a</span><span class="k">=</span><span class="mi">20</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>a: 10
b: 20
a: 30
b: 40
a: 20
b: 40
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[47]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">res46_1</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span>
<span class="ansi-cyan-fg">res46_2</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">70</span>
<span class="ansi-cyan-fg">res46_3</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">60</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [49]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">sum</span><span class="o">(</span><span class="n">nums</span><span class="k">:</span><span class="kt">Int*</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">var</span> <span class="n">s</span> <span class="k">=</span> <span class="mi">0</span>
    <span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">nums</span><span class="o">){</span>
        <span class="n">s</span> <span class="k">=</span> <span class="n">s</span> <span class="o">+</span> <span class="n">num</span>
    <span class="o">}</span>
    <span class="o">(</span><span class="n">s</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">result</span> <span class="k">=</span> <span class="n">sum</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[49]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">sum</span>
<span class="ansi-cyan-fg">result</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">15</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [50]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>
<span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[50]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">res49_1</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">30</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [54]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">// add(a, b)</span>
<span class="c1">// g(b) = add(10, b)</span>

<span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">)(</span><span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">adding</span> <span class="k">=</span> <span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">)</span><span class="k">_</span>
<span class="n">adding</span><span class="o">(</span><span class="mi">40</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[54]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">add</span>
<span class="ansi-cyan-fg">adding</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1>
<span class="ansi-cyan-fg">res53_2</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">50</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [55]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">fact</span><span class="o">(</span><span class="n">n</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="k">if</span><span class="o">(</span><span class="n">n</span> <span class="o"><</span> <span class="mi">1</span><span class="o">){</span>
        <span class="k">return</span> <span class="mi">1</span>
    <span class="o">}</span><span class="k">else</span><span class="o">{</span>
        <span class="k">return</span> <span class="n">n</span> <span class="o">*</span> <span class="n">fact</span><span class="o">(</span><span class="n">n</span> <span class="o">-</span> <span class="mi">1</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">result</span> <span class="k">=</span> <span class="n">fact</span><span class="o">(</span><span class="mi">6</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[55]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">fact</span>
<span class="ansi-cyan-fg">result</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">720</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [58]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">scala.collection.mutable.ListBuffer</span>

<span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">5</span><span class="o">)</span>
<span class="k">var</span> <span class="n">squares</span><span class="k">:</span><span class="kt">ListBuffer</span><span class="o">[</span><span class="kt">Int</span><span class="o">]</span> <span class="k">=</span> <span class="nc">ListBuffer</span><span class="o">()</span>
<span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="n">numbers</span><span class="o">){</span>
    <span class="n">squares</span> <span class="o">+=</span> <span class="n">i</span> <span class="o">*</span> <span class="n">i</span>
<span class="o">}</span>
<span class="n">squares</span>

<span class="k">val</span> <span class="n">sqrs</span> <span class="k">=</span> <span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="n">numbers</span><span class="o">)</span> <span class="k">yield</span> <span class="n">i</span> <span class="o">*</span> <span class="n">i</span>
<span class="n">sqrs</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[58]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.mutable.ListBuffer</span> 
<span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">5</span>)
<span class="ansi-cyan-fg">squares</span>: <span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">9</span>, <span class="ansi-green-fg">16</span>, <span class="ansi-green-fg">25</span>)
<span class="ansi-cyan-fg">res57_4</span>: <span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">9</span>, <span class="ansi-green-fg">16</span>, <span class="ansi-green-fg">25</span>)
<span class="ansi-cyan-fg">sqrs</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">9</span>, <span class="ansi-green-fg">16</span>, <span class="ansi-green-fg">25</span>)
<span class="ansi-cyan-fg">res57_6</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">9</span>, <span class="ansi-green-fg">16</span>, <span class="ansi-green-fg">25</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [ ]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Classes and Objects</span>
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [59]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Person</span><span class="o">{</span>
    <span class="k">var</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"ABC"</span>
    <span class="k">var</span> <span class="n">age</span> <span class="k">=</span> <span class="mi">30</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[59]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Person</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [60]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">object</span> <span class="nc">PersonExample</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">main</span><span class="o">(</span><span class="n">args</span><span class="k">:</span><span class="kt">Array</span><span class="o">[</span><span class="kt">String</span><span class="o">])</span> <span class="k">:</span> <span class="kt">Unit</span> <span class="o">=</span> <span class="o">{</span>
         <span class="k">val</span> <span class="n">person</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Person</span><span class="o">()</span>
    <span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[60]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">object</span> <span class="ansi-cyan-fg">PersonExample</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [61]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">person</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Person</span>
    <span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>ABC
30
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[61]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">person</span>: <span class="ansi-green-fg">Person</span> = $sess.cmd58Wrapper$Helper$Person@38282e55</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [62]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Employee</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">){</span>
    <span class="k">def</span> <span class="n">show</span><span class="o">(){</span>
    <span class="n">println</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">34</span><span class="o">)</span>
<span class="n">emp</span><span class="o">.</span><span class="n">show</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hari
34
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[62]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span>
<span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">Employee</span> = $sess.cmd61Wrapper$Helper$Employee@6fed2d0c</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [63]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">case</span> <span class="k">class</span> <span class="nc">Person</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span>

<span class="k">val</span> <span class="n">person</span> <span class="k">=</span> <span class="nc">Person</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">40</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hari
40
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[63]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Person</span>
<span class="ansi-cyan-fg">person</span>: <span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">Person</span> = <span class="ansi-yellow-fg">Person</span>(<span class="ansi-green-fg">"Hari"</span>, <span class="ansi-green-fg">40</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [65]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Employee</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">){</span>
    <span class="k">var</span> <span class="n">place</span> <span class="k">=</span> <span class="s">"NA"</span>
    <span class="k">def</span> <span class="k">this</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">place</span><span class="k">:</span><span class="kt">String</span><span class="o">){</span>
        <span class="k">this</span><span class="o">(</span><span class="n">name</span><span class="o">,</span> <span class="n">age</span><span class="o">)</span>
        <span class="k">this</span><span class="o">.</span><span class="n">place</span> <span class="k">=</span> <span class="n">place</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">show</span><span class="o">(){</span>
    <span class="n">println</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">place</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">emp</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">34</span><span class="o">,</span> <span class="s">"Mysore"</span><span class="o">)</span>
<span class="k">val</span> <span class="n">emp1</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Employee</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">34</span><span class="o">)</span>
<span class="n">emp</span><span class="o">.</span><span class="n">show</span><span class="o">()</span>
<span class="n">emp1</span><span class="o">.</span><span class="n">show</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hari
34
Mysore
Hari
34
NA
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[65]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Employee</span>
<span class="ansi-cyan-fg">emp</span>: <span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">Employee</span> = $sess.cmd64Wrapper$Helper$Employee@2dff6788
<span class="ansi-cyan-fg">emp1</span>: <span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">wrapper</span>.<span class="ansi-green-fg">Employee</span> = $sess.cmd64Wrapper$Helper$Employee@783477be</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [66]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Maths</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">={</span>
        <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">c</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span> <span class="o">+</span> <span class="n">c</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">math</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Maths</span><span class="o">()</span>
<span class="n">println</span><span class="o">(</span><span class="n">math</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">10</span><span class="o">))</span>
<span class="n">println</span><span class="o">(</span><span class="n">math</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="mi">10</span><span class="o">,</span> <span class="mi">20</span><span class="o">,</span> <span class="mi">30</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>20
60
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[66]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Maths</span>
<span class="ansi-cyan-fg">math</span>: <span class="ansi-green-fg">Maths</span> = $sess.cmd65Wrapper$Helper$Maths@6c1f42e7</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [70]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Human</span><span class="o">{</span>
    <span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"NA"</span>
    <span class="k">def</span> <span class="n">message</span><span class="o">(){</span>
        <span class="n">println</span><span class="o">(</span><span class="s">"Human"</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[70]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Human</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [73]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Male</span> <span class="k">extends</span> <span class="nc">Human</span> <span class="o">{</span>
    <span class="k">override</span> <span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="s">"ABC"</span>
    <span class="k">override</span> <span class="k">def</span> <span class="n">message</span><span class="o">(){</span>
        <span class="n">println</span><span class="o">(</span><span class="s">"Male"</span><span class="o">)</span>
        <span class="n">println</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[73]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Male</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [74]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">male</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Male</span><span class="o">()</span>
<span class="n">male</span><span class="o">.</span><span class="n">message</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Male
ABC
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[74]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">male</span>: <span class="ansi-green-fg">Male</span> = $sess.cmd72Wrapper$Helper$Male@27824ee5</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [1]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">abstract</span> <span class="k">class</span> <span class="nc">Human</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span><span class="k">:</span><span class="kt">String</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span><span class="kt">Int</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[1]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Human</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [1]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">human</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Human</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stderr output_text">

<pre>cmd1.sc:1: class Human is abstract; cannot be instantiated
val human = new Human()
            ^</pre>

</div>

</div>

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre>Compilation Failed</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [2]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Male</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Human</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[2]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Male</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [3]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">person</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Male</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">40</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">getName</span><span class="o">())</span>
<span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">getAge</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hari
40
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[3]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">person</span>: <span class="ansi-green-fg">Male</span> = $sess.cmd1Wrapper$Helper$Male@5e984b4</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [3]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">male1</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Male</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stderr output_text">

<pre>cmd3.sc:1: not enough arguments for constructor Male: (name: String, age: Int)cmd3Wrapper.this.cmd1.wrapper.Male.
Unspecified value parameters name, age.
val male1 = new Male()
            ^</pre>

</div>

</div>

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre>Compilation Failed</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [4]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">trait</span> <span class="nc">Human</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span> <span class="k">:</span> <span class="kt">Int</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[4]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">trait</span> <span class="ansi-cyan-fg">Human</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [5]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Male</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Human</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[5]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Male</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [6]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">person</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Male</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">,</span> <span class="mi">40</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">getName</span><span class="o">())</span>
<span class="n">println</span><span class="o">(</span><span class="n">person</span><span class="o">.</span><span class="n">getAge</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hari
40
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[6]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">person</span>: <span class="ansi-green-fg">Male</span> = $sess.cmd4Wrapper$Helper$Male@267190a0</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [13]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">abstract</span> <span class="k">class</span> <span class="nc">Human</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span><span class="k">:</span><span class="kt">String</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span><span class="kt">Int</span>
<span class="o">}</span>

<span class="k">trait</span> <span class="nc">Printable</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">show</span><span class="o">()</span>
<span class="o">}</span>

<span class="k">trait</span> <span class="nc">Display</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">message</span><span class="o">(){</span>

    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[13]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Human</span>
defined <span class="ansi-green-fg">trait</span> <span class="ansi-cyan-fg">Printable</span>
defined <span class="ansi-green-fg">trait</span> <span class="ansi-cyan-fg">Display</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [15]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">class</span> <span class="nc">Male</span><span class="o">(</span><span class="n">name</span><span class="k">:</span><span class="kt">String</span><span class="o">,</span> <span class="n">age</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">extends</span> <span class="nc">Human</span> <span class="k">with</span> <span class="nc">Printable</span> <span class="k">with</span> <span class="nc">Display</span><span class="o">{</span>
    <span class="k">def</span> <span class="n">getName</span><span class="o">()</span> <span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">name</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">getAge</span><span class="o">()</span><span class="k">:</span><span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
        <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="n">age</span><span class="o">)</span>
    <span class="o">}</span>
    <span class="k">def</span> <span class="n">show</span><span class="o">(){</span>
        <span class="k">val</span> <span class="n">name</span> <span class="k">=</span> <span class="k">this</span><span class="o">.</span><span class="n">getName</span><span class="o">()</span>
        <span class="k">val</span> <span class="n">age</span> <span class="k">=</span> <span class="k">this</span><span class="o">.</span><span class="n">getAge</span><span class="o">()</span>
        <span class="n">println</span><span class="o">(</span><span class="s">s"Hi</span> <span class="si">$name</span><span class="s">, you are</span> <span class="si">$age</span> <span class="s">years old"</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[15]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">class</span> <span class="ansi-cyan-fg">Male</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [16]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">person</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Male</span><span class="o">(</span><span class="s">"Ravi"</span><span class="o">,</span> <span class="mi">35</span><span class="o">)</span>
<span class="n">person</span><span class="o">.</span><span class="n">show</span><span class="o">()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Hi Ravi, you are 35 years old
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[16]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">person</span>: <span class="ansi-green-fg">Male</span> = $sess.cmd14Wrapper$Helper$Male@2d6b4f15</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [21]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">,</span><span class="mi">4</span><span class="o">,</span><span class="mi">0</span><span class="o">,</span><span class="mi">5</span><span class="o">,</span><span class="mi">6</span><span class="o">,</span><span class="mi">7</span><span class="o">,</span><span class="mi">8</span><span class="o">,</span><span class="mi">9</span><span class="o">)</span>

<span class="k">for</span><span class="o">(</span><span class="n">num</span> <span class="k"><-</span> <span class="n">numbers</span><span class="o">){</span>
    <span class="k">try</span><span class="o">{</span>
      <span class="n">println</span><span class="o">(</span><span class="mi">100</span> <span class="o">/</span> <span class="n">num</span><span class="o">)</span>   
    <span class="o">}</span>
    <span class="k">catch</span><span class="o">{</span>
        <span class="k">case</span> <span class="n">ae</span><span class="k">:</span><span class="kt">ArithmeticException</span> <span class="o">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"Division by Zero Exception"</span><span class="o">)</span>
        <span class="k">case</span> <span class="n">e</span><span class="k">:</span><span class="kt">Exception</span> <span class="o">=></span> <span class="n">println</span><span class="o">(</span><span class="n">e</span><span class="o">.</span><span class="n">getMessage</span><span class="o">())</span>
        <span class="k">case</span> <span class="k">_</span> <span class="k">=></span> <span class="n">println</span><span class="o">(</span><span class="s">"Reason  for Exception is unknown"</span><span class="o">)</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>100
50
33
25
Division by Zero Exception
20
16
14
12
11
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[21]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [24]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">a</span> <span class="k">=</span> <span class="s">"ABC"</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[24]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"ABC"</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [25]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">a</span><span class="o">.</span><span class="n">toInt</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre><span class="ansi-red-fg">java.lang.NumberFormatException: For input string: "ABC"</span>
  java.lang.NumberFormatException.forInputString(<span class="ansi-green-fg">NumberFormatException.java</span>:<span class="ansi-green-fg">65</span>)
  java.lang.Integer.parseInt(<span class="ansi-green-fg">Integer.java</span>:<span class="ansi-green-fg">580</span>)
  java.lang.Integer.parseInt(<span class="ansi-green-fg">Integer.java</span>:<span class="ansi-green-fg">615</span>)
  scala.collection.immutable.StringLike$class.toInt(<span class="ansi-green-fg">StringLike.scala</span>:<span class="ansi-green-fg">273</span>)
  scala.collection.immutable.StringOps.toInt(<span class="ansi-green-fg">StringOps.scala</span>:<span class="ansi-green-fg">29</span>)
  $sess.cmd24Wrapper$Helper.<init>(<span class="ansi-green-fg">cmd24.sc</span>:<span class="ansi-green-fg">1</span>)
  $sess.cmd24Wrapper.<init>(<span class="ansi-green-fg">cmd24.sc</span>:<span class="ansi-green-fg">181</span>)
  $sess.cmd24$.<init>(<span class="ansi-green-fg">cmd24.sc</span>:<span class="ansi-green-fg">113</span>)
  $sess.cmd24$.<clinit>(<span class="ansi-green-fg">cmd24.sc</span>:<span class="ansi-green-fg">-1</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [26]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[26]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res25</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [27]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span><span class="o">(</span><span class="mi">2</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[27]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res26</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">3</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [28]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span><span class="o">(</span><span class="mi">4</span><span class="o">)</span> <span class="k">=</span> <span class="mi">10</span>
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [29]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[29]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res28</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">10</span>, <span class="ansi-green-fg">5</span>, <span class="ansi-green-fg">6</span>, <span class="ansi-green-fg">7</span>, <span class="ansi-green-fg">8</span>, <span class="ansi-green-fg">9</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [30]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">nums</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Array</span><span class="o">[</span><span class="kt">Int</span><span class="o">](</span><span class="mi">10</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[30]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">nums</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">0</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [31]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">i</span> <span class="k"><-</span> <span class="mi">0</span> <span class="n">until</span> <span class="mi">10</span><span class="o">){</span>
    <span class="n">nums</span><span class="o">(</span><span class="n">i</span><span class="o">)</span> <span class="k">=</span> <span class="n">i</span> <span class="o">*</span> <span class="n">i</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [32]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">nums</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[32]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res31</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Array</span>(<span class="ansi-green-fg">0</span>, <span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">9</span>, <span class="ansi-green-fg">16</span>, <span class="ansi-green-fg">25</span>, <span class="ansi-green-fg">36</span>, <span class="ansi-green-fg">49</span>, <span class="ansi-green-fg">64</span>, <span class="ansi-green-fg">81</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [35]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">java.util.Date</span>

<span class="k">val</span> <span class="n">date</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">Date</span><span class="o">()</span>
<span class="n">println</span><span class="o">(</span><span class="n">date</span><span class="o">.</span><span class="n">isInstanceOf</span><span class="o">[</span><span class="kt">Date</span><span class="o">])</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>true
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[35]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">java.util.Date</span> 
<span class="ansi-cyan-fg">date</span>: <span class="ansi-green-fg">Date</span> = Sun Dec 10 11:03:09 IST 2017</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [36]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">a</span> <span class="k">=</span> <span class="mi">100</span>
<span class="k">val</span> <span class="n">b</span> <span class="k">=</span> <span class="n">a</span><span class="o">.</span><span class="n">asInstanceOf</span><span class="o">[</span><span class="kt">Double</span><span class="o">]</span>
<span class="n">println</span><span class="o">(</span><span class="n">b</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>100.0
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[36]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">a</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">100</span>
<span class="ansi-cyan-fg">b</span>: <span class="ansi-green-fg">Double</span> = <span class="ansi-green-fg">100.0</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [37]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">java.util._</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[37]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">java.util._</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [38]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">java.util.</span><span class="o">{</span><span class="nc">Date</span><span class="o">,</span> <span class="nc">Calendar</span><span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[38]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">java.util.{Date, Calendar}</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [39]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">persons</span> <span class="k">=</span> <span class="nc">Array</span><span class="o">(</span><span class="nc">Array</span><span class="o">(</span><span class="s">"Naga"</span><span class="o">,</span> <span class="s">"Ravi"</span><span class="o">),</span> <span class="nc">Array</span><span class="o">(</span><span class="mi">30</span><span class="o">,</span> <span class="mi">33</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[39]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">persons</span>: <span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">Array</span>[<span class="ansi-green-fg">_40</span>] forSome { type <span class="ansi-green-fg">_40</span> >: <span class="ansi-green-fg">Int</span> with <span class="ansi-green-fg">String</span> }] = <span class="ansi-yellow-fg">Array</span>([Ljava.lang.String;@7adbbf67, [I@30530aa5)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [41]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">println</span><span class="o">(</span><span class="n">persons</span><span class="o">(</span><span class="mi">0</span><span class="o">)(</span><span class="mi">1</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Ravi
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [43]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">var</span> <span class="n">message</span> <span class="k">=</span> <span class="s">raw"naga\t30\tbangalore\n"</span>
<span class="n">println</span><span class="o">(</span><span class="n">message</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>naga\t30\tbangalore\n
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[43]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">message</span>: <span class="ansi-green-fg">String</span> = <span class="ansi-green-fg">"""
naga\t30\tbangalore\n
"""</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [47]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Scala Collections</span>
<span class="k">import</span> <span class="nn">scala.collection.mutable.ListBuffer</span>
<span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">ListBuffer</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[47]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.mutable.ListBuffer</span> 
<span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">mutable</span>.<span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">"Hari"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [49]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">names</span><span class="o">+=</span> <span class="s">"Ravi"</span>
<span class="n">names</span> <span class="o">+=</span> <span class="s">"Kishore"</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[49]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res48_0</span>: <span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">"Hari"</span>, <span class="ansi-green-fg">"Ravi"</span>, <span class="ansi-green-fg">"Ravi"</span>, <span class="ansi-green-fg">"Kishore"</span>)
<span class="ansi-cyan-fg">res48_1</span>: <span class="ansi-green-fg">ListBuffer</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">ListBuffer</span>(<span class="ansi-green-fg">"Hari"</span>, <span class="ansi-green-fg">"Ravi"</span>, <span class="ansi-green-fg">"Ravi"</span>, <span class="ansi-green-fg">"Kishore"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [50]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"A"</span><span class="o">,</span> <span class="s">"B"</span><span class="o">,</span> <span class="s">"C"</span><span class="o">,</span> <span class="s">"D"</span><span class="o">)</span>
<span class="k">for</span><span class="o">(</span><span class="n">name</span> <span class="k"><-</span> <span class="n">names</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>A
B
C
D
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[50]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">"A"</span>, <span class="ansi-green-fg">"B"</span>, <span class="ansi-green-fg">"C"</span>, <span class="ansi-green-fg">"D"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [52]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="n">scala</span><span class="o">.</span><span class="n">collection</span><span class="o">.</span><span class="n">mutable</span><span class="o">.</span><span class="nc">Set</span><span class="o">(</span><span class="s">"Hari"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[52]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">mutable</span>.<span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"Hari"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [53]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">names</span> <span class="o">+=</span> <span class="s">"Ravi"</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[53]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res52</span>: <span class="ansi-green-fg">collection</span>.<span class="ansi-green-fg">mutable</span>.<span class="ansi-green-fg">Set</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">Set</span>(<span class="ansi-green-fg">"Hari"</span>, <span class="ansi-green-fg">"Ravi"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [54]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="k">new</span> <span class="nc">ArrayList</span><span class="o">[</span><span class="kt">String</span><span class="o">]()</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[54]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">ArrayList</span>[<span class="ansi-green-fg">String</span>] = []</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [55]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">import</span> <span class="nn">scala.collection.JavaConversions._</span>

<span class="n">names</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="s">"A"</span><span class="o">)</span>
<span class="n">names</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="s">"B"</span><span class="o">)</span>
<span class="n">names</span><span class="o">.</span><span class="n">add</span><span class="o">(</span><span class="s">"C"</span><span class="o">)</span>

<span class="k">for</span><span class="o">(</span><span class="n">name</span> <span class="k"><-</span> <span class="n">names</span><span class="o">){</span>
    <span class="n">println</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>A
B
C
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[55]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.collection.JavaConversions._</span> 
<span class="ansi-cyan-fg">res54_1</span>: <span class="ansi-green-fg">Boolean</span> = <span class="ansi-green-fg">true</span>
<span class="ansi-cyan-fg">res54_2</span>: <span class="ansi-green-fg">Boolean</span> = <span class="ansi-green-fg">true</span>
<span class="ansi-cyan-fg">res54_3</span>: <span class="ansi-green-fg">Boolean</span> = <span class="ansi-green-fg">true</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [64]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">)</span>
<span class="n">numbers</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[64]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>)
<span class="ansi-cyan-fg">res63_1</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [65]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">def</span> <span class="n">add</span><span class="o">(</span><span class="n">a</span><span class="k">:</span><span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span>
    <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">)</span>
<span class="o">}</span>
<span class="n">numbers</span><span class="o">.</span><span class="n">map</span><span class="o">(</span><span class="n">num</span> <span class="k">=></span> <span class="n">num</span> <span class="o">*</span> <span class="n">num</span><span class="o">).</span><span class="n">filter</span><span class="o">(</span><span class="n">num</span> <span class="k">=></span> <span class="n">num</span> <span class="o">></span> <span class="mi">30</span><span class="o">).</span><span class="n">reduce</span><span class="o">((</span><span class="n">a</span><span class="o">,</span><span class="n">b</span><span class="o">)</span> <span class="k">=></span> <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_text output_error">

<pre><span class="ansi-red-fg">java.lang.UnsupportedOperationException: empty.reduceLeft</span>
  scala.collection.LinearSeqOptimized$class.reduceLeft(<span class="ansi-green-fg">LinearSeqOptimized.scala</span>:<span class="ansi-green-fg">137</span>)
  scala.collection.immutable.List.reduceLeft(<span class="ansi-green-fg">List.scala</span>:<span class="ansi-green-fg">84</span>)
  scala.collection.TraversableOnce$class.reduce(<span class="ansi-green-fg">TraversableOnce.scala</span>:<span class="ansi-green-fg">208</span>)
  scala.collection.AbstractTraversable.reduce(<span class="ansi-green-fg">Traversable.scala</span>:<span class="ansi-green-fg">104</span>)
  $sess.cmd64Wrapper$Helper.<init>(<span class="ansi-green-fg">cmd64.sc</span>:<span class="ansi-green-fg">4</span>)
  $sess.cmd64Wrapper.<init>(<span class="ansi-green-fg">cmd64.sc</span>:<span class="ansi-green-fg">607</span>)
  $sess.cmd64$.<init>(<span class="ansi-green-fg">cmd64.sc</span>:<span class="ansi-green-fg">404</span>)
  $sess.cmd64$.<clinit>(<span class="ansi-green-fg">cmd64.sc</span>:<span class="ansi-green-fg">-1</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [63]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">numbers</span><span class="o">.</span><span class="n">max</span>
<span class="n">numbers</span><span class="o">.</span><span class="n">min</span>
<span class="n">numbers</span><span class="o">.</span><span class="n">sum</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[63]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res62_0</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">7</span>
<span class="ansi-cyan-fg">res62_1</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">1</span>
<span class="ansi-cyan-fg">res62_2</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">28</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [67]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span><span class="mi">2</span><span class="o">,</span><span class="mi">3</span><span class="o">)</span>
<span class="k">val</span> <span class="n">squares</span> <span class="k">=</span> <span class="n">numbers</span><span class="o">.</span><span class="n">map</span><span class="o">(</span><span class="n">num</span> <span class="o">=>{</span>
 <span class="n">num</span> <span class="o">*</span> <span class="n">num</span>   
<span class="o">})</span>
<span class="k">val</span> <span class="n">sum</span> <span class="k">=</span> <span class="n">squares</span><span class="o">.</span><span class="n">reduce</span><span class="o">((</span><span class="n">a</span><span class="o">,</span> <span class="n">b</span><span class="o">)</span> <span class="k">=></span> <span class="o">(</span><span class="n">a</span> <span class="o">+</span> <span class="n">b</span><span class="o">))</span>
<span class="n">sum</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[67]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>)
<span class="ansi-cyan-fg">squares</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">4</span>, <span class="ansi-green-fg">9</span>)
<span class="ansi-cyan-fg">sum</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">14</span>
<span class="ansi-cyan-fg">res66_3</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">14</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [75]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Option</span>

<span class="k">def</span> <span class="n">convertStringToNum</span><span class="o">(</span><span class="n">num</span><span class="k">:</span><span class="kt">String</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Option</span><span class="o">[</span><span class="kt">Int</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
    <span class="k">try</span><span class="o">{</span>
      <span class="nc">Some</span><span class="o">(</span><span class="n">num</span><span class="o">.</span><span class="n">toInt</span><span class="o">)</span>  
    <span class="o">}</span><span class="k">catch</span><span class="o">{</span>
        <span class="k">case</span> <span class="n">e</span><span class="k">:</span><span class="kt">Exception</span> <span class="o">=></span> <span class="nc">None</span>
    <span class="o">}</span>

<span class="o">}</span>

<span class="k">val</span> <span class="n">result</span> <span class="k">=</span> <span class="n">convertStringToNum</span><span class="o">(</span><span class="s">"100"</span><span class="o">)</span>
<span class="n">println</span><span class="o">(</span><span class="n">result</span><span class="o">.</span><span class="n">get</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>100
</pre>

</div>

</div>

<div class="output_area">

<div class="prompt output_prompt">Out[75]:</div>

<div class="output_text output_subarea output_execute_result">

<pre>defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">convertStringToNum</span>
<span class="ansi-cyan-fg">result</span>: <span class="ansi-green-fg">Option</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Some</span>(<span class="ansi-green-fg">100</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [79]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">numbers</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"1"</span><span class="o">,</span> <span class="s">"2"</span><span class="o">,</span> <span class="s">"3"</span><span class="o">,</span> <span class="s">"ABC"</span><span class="o">,</span> <span class="s">"123"</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[79]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">numbers</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">"1"</span>, <span class="ansi-green-fg">"2"</span>, <span class="ansi-green-fg">"3"</span>, <span class="ansi-green-fg">"ABC"</span>, <span class="ansi-green-fg">"123"</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [81]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">nums</span> <span class="k">=</span> <span class="n">numbers</span><span class="o">.</span><span class="n">map</span><span class="o">(</span><span class="n">num</span> <span class="k">=></span> <span class="n">convertStringToNum</span><span class="o">(</span><span class="n">num</span><span class="o">)).</span><span class="n">filter</span><span class="o">(</span><span class="n">num</span> <span class="k">=></span> <span class="n">num</span> <span class="o">!=</span> <span class="nc">None</span><span class="o">).</span><span class="n">map</span><span class="o">(</span><span class="n">num</span> <span class="k">=></span> <span class="o">(</span><span class="n">num</span><span class="o">.</span><span class="n">get</span><span class="o">))</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[81]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">nums</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">1</span>, <span class="ansi-green-fg">2</span>, <span class="ansi-green-fg">3</span>, <span class="ansi-green-fg">123</span>)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [82]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">names</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"ravi"</span><span class="o">,</span> <span class="s">""</span><span class="o">,</span> <span class="s">"siva"</span><span class="o">,</span> <span class="s">""</span><span class="o">)</span>
<span class="k">def</span> <span class="n">validateName</span><span class="o">(</span><span class="n">name</span><span class="k">:</span> <span class="kt">String</span><span class="o">)</span><span class="k">:</span> <span class="kt">Either</span><span class="o">[</span><span class="kt">String</span>, <span class="kt">String</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
 <span class="k">if</span> <span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="n">isEmpty</span><span class="o">)</span> <span class="nc">Left</span><span class="o">(</span><span class="s">"Name is empty"</span><span class="o">)</span>
 <span class="k">else</span> <span class="nc">Right</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
 <span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[82]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">names</span>: <span class="ansi-green-fg">List</span>[<span class="ansi-green-fg">String</span>] = <span class="ansi-yellow-fg">List</span>(<span class="ansi-green-fg">"ravi"</span>, <span class="ansi-green-fg">""</span>, <span class="ansi-green-fg">"siva"</span>, <span class="ansi-green-fg">""</span>)
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">validateName</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [83]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">for</span><span class="o">(</span><span class="n">name</span> <span class="k"><-</span> <span class="n">names</span><span class="o">){</span>
    <span class="k">val</span> <span class="n">result</span> <span class="k">=</span> <span class="n">validateName</span><span class="o">(</span><span class="n">name</span><span class="o">)</span>
    <span class="n">println</span><span class="o">(</span><span class="n">result</span><span class="o">)</span>
<span class="o">}</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="output_subarea output_stream output_stdout output_text">

<pre>Right(ravi)
Left(Name is empty)
Right(siva)
Left(Name is empty)
</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [85]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="c1">//Try</span>
<span class="k">import</span> <span class="nn">scala.util.Try</span>

<span class="k">def</span> <span class="n">divide</span><span class="o">(</span><span class="n">num</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">:</span> <span class="kt">Try</span><span class="o">[</span><span class="kt">Int</span><span class="o">]</span> <span class="k">=</span> <span class="o">{</span>
    <span class="k">val</span> <span class="n">data</span> <span class="k">=</span> <span class="nc">Try</span><span class="o">(</span><span class="mi">100</span> <span class="o">/</span> <span class="n">num</span><span class="o">)</span>
    <span class="o">(</span><span class="n">data</span><span class="o">)</span>
<span class="o">}</span>

<span class="k">val</span> <span class="n">result</span> <span class="k">=</span> <span class="n">divide</span><span class="o">(</span><span class="mi">0</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[85]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-green-fg">import</span> <span class="ansi-cyan-fg">scala.util.Try</span> 
defined <span class="ansi-green-fg">function</span> <span class="ansi-cyan-fg">divide</span>
<span class="ansi-cyan-fg">result</span>: <span class="ansi-green-fg">Try</span>[<span class="ansi-green-fg">Int</span>] = <span class="ansi-yellow-fg">Failure</span>(java.lang.ArithmeticException: / by zero)</pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [86]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">factor</span> <span class="k">=</span> <span class="mi">10</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[86]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">factor</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">10</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [87]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">val</span> <span class="n">data</span> <span class="k">=</span> <span class="o">(</span><span class="n">x</span><span class="k">:</span><span class="kt">Int</span><span class="o">)</span> <span class="k">=></span> <span class="n">x</span> <span class="o">*</span> <span class="n">factor</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[87]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">data</span>: <span class="ansi-green-fg">Int</span> => <span class="ansi-green-fg">Int</span> = <function1></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [88]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="n">data</span><span class="o">(</span><span class="mi">10</span><span class="o">)</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[88]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">res87</span>: <span class="ansi-green-fg">Int</span> = <span class="ansi-green-fg">100</span></pre>

</div>

</div>

</div>

</div>

</div>

<div class="cell border-box-sizing code_cell rendered">

<div class="input">

<div class="prompt input_prompt">In [89]:</div>

<div class="inner_cell">

<div class="input_area">

<div class=" highlight hl-scala">

<pre><span></span><span class="k">var</span> <span class="n">name</span> <span class="k">=</span> <span class="nc">Nil</span>
</pre>

</div>

</div>

</div>

</div>

<div class="output_wrapper">

<div class="output">

<div class="output_area">

<div class="prompt output_prompt">Out[89]:</div>

<div class="output_text output_subarea output_execute_result">

<pre><span class="ansi-cyan-fg">name</span>: <span class="ansi-green-fg">Nil</span>.type = <span class="ansi-yellow-fg">List</span>()</pre>

</div>

</div>

</div>

</div>

</div>

</div>

</div>
