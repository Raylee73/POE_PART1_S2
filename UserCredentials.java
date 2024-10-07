<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width">
        <meta name="robots" content="noindex">
        <style>html {background-color: #fff}</style>
        <link rel="stylesheet" href="../../../style.css">
        <title>src/part1/UserCredentials.java · Part-1-S2 · GitFront</title>
    </head>
    <body>
        <div class="container">
            <div class="location">
                <a href="../../..">Part-1-S2</a> /
                <a href="../../../tree/src/">src</a> /
                <a href="../../../tree/src/part1/">part1</a> /
                <span>UserCredentials.java</span>
            </div>

            <div class="blob-view">
                <div class="header">
                    <div class="header-basename">UserCredentials.java</div>
                    <div class="last">
                        <a class="btn" href="../../../raw/src/part1/UserCredentials.java">Raw</a>
                    </div>
                </div>
                <div class="content ">
                    <pre tabindex="0" class="highlight-chroma"><code><span class="highlight-line"><span class="highlight-cl">
</span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-kn">package</span> <span class="highlight-nn">part1</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">
</span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-cm">/**
</span></span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-cm"> *Student Number:
</span></span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-cm"> * Full Name: 
</span></span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-cm"> * Assignment: 
</span></span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-cm"> * 
</span></span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-cm"> */</span>
</span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-kd">public</span> <span class="highlight-kd">class</span> <span class="highlight-nc">UserCredentials</span> <span class="highlight-o">{</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">private</span> <span class="highlight-kd">static</span> <span class="highlight-n">UserCredentials</span> <span class="highlight-n">instance</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">private</span> <span class="highlight-n">String</span> <span class="highlight-n">username</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">private</span> <span class="highlight-n">String</span> <span class="highlight-n">password</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">private</span> <span class="highlight-nf">UserCredentials</span><span class="highlight-o">(</span><span class="highlight-o">)</span> 
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-o">{</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-o">}</span>
</span></span><span class="highlight-line"><span class="highlight-cl">
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">public</span> <span class="highlight-kd">static</span> <span class="highlight-n">UserCredentials</span> <span class="highlight-nf">getInstance</span><span class="highlight-o">(</span><span class="highlight-o">)</span> <span class="highlight-o">{</span>
</span></span><span class="highlight-line"><span class="highlight-cl">        <span class="highlight-k">if</span> <span class="highlight-o">(</span><span class="highlight-n">instance</span> <span class="highlight-o">=</span><span class="highlight-o">=</span> <span class="highlight-kc">null</span><span class="highlight-o">)</span> <span class="highlight-o">{</span>
</span></span><span class="highlight-line"><span class="highlight-cl">            <span class="highlight-n">instance</span> <span class="highlight-o">=</span> <span class="highlight-k">new</span> <span class="highlight-n">UserCredentials</span><span class="highlight-o">(</span><span class="highlight-o">)</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">        <span class="highlight-o">}</span>
</span></span><span class="highlight-line"><span class="highlight-cl">        <span class="highlight-k">return</span> <span class="highlight-n">instance</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-o">}</span>
</span></span><span class="highlight-line"><span class="highlight-cl">
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">public</span> <span class="highlight-kt">void</span> <span class="highlight-nf">setCredentials</span><span class="highlight-o">(</span><span class="highlight-n">String</span> <span class="highlight-n">username</span><span class="highlight-o">,</span> <span class="highlight-n">String</span> <span class="highlight-n">password</span><span class="highlight-o">)</span> <span class="highlight-o">{</span>
</span></span><span class="highlight-line"><span class="highlight-cl">        <span class="highlight-k">this</span><span class="highlight-o">.</span><span class="highlight-na">username</span> <span class="highlight-o">=</span> <span class="highlight-n">username</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">        <span class="highlight-k">this</span><span class="highlight-o">.</span><span class="highlight-na">password</span> <span class="highlight-o">=</span> <span class="highlight-n">password</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-o">}</span>
</span></span><span class="highlight-line"><span class="highlight-cl">
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-kd">public</span> <span class="highlight-kt">boolean</span> <span class="highlight-nf">checkCredentials</span><span class="highlight-o">(</span><span class="highlight-n">String</span> <span class="highlight-n">username</span><span class="highlight-o">,</span> <span class="highlight-n">String</span> <span class="highlight-n">password</span><span class="highlight-o">)</span> <span class="highlight-o">{</span>
</span></span><span class="highlight-line"><span class="highlight-cl">        <span class="highlight-k">return</span> <span class="highlight-k">this</span><span class="highlight-o">.</span><span class="highlight-na">username</span> <span class="highlight-o">!</span><span class="highlight-o">=</span> <span class="highlight-kc">null</span> <span class="highlight-o">&amp;</span><span class="highlight-o">&amp;</span> <span class="highlight-k">this</span><span class="highlight-o">.</span><span class="highlight-na">username</span><span class="highlight-o">.</span><span class="highlight-na">equals</span><span class="highlight-o">(</span><span class="highlight-n">username</span><span class="highlight-o">)</span> <span class="highlight-o">&amp;</span><span class="highlight-o">&amp;</span> <span class="highlight-k">this</span><span class="highlight-o">.</span><span class="highlight-na">password</span> <span class="highlight-o">!</span><span class="highlight-o">=</span> <span class="highlight-kc">null</span> <span class="highlight-o">&amp;</span><span class="highlight-o">&amp;</span> <span class="highlight-k">this</span><span class="highlight-o">.</span><span class="highlight-na">password</span><span class="highlight-o">.</span><span class="highlight-na">equals</span><span class="highlight-o">(</span><span class="highlight-n">password</span><span class="highlight-o">)</span><span class="highlight-o">;</span>
</span></span><span class="highlight-line"><span class="highlight-cl">    <span class="highlight-o">}</span>
</span></span><span class="highlight-line"><span class="highlight-cl"><span class="highlight-o">}</span>
</span></span></code></pre>
                </div>
            </div>

            <div class="space"></div>
            <div class="footer">
                Powered by <a href="https://gitfront.io">GitFront</a>
            </div>
        </div>
    </body>
</html>
