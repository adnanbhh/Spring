<style>
body
{
	background-color:#F2F2F2 ;
}

h3
{		
	text-align: center;
}

 /*username && password */
.box input[type = "text"], .box input[type = "number"], .box select, select{
	border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid #3498db;
	padding: 14px 10px;
	width: 200px;
	outline: none;
	color: black;
	border-radius: 24px;
	transition: 0.25s;
}

.box label
{
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	padding: 14px 10px;
	width: 200px;
	color: black;

}

.box input[type = "text"]:focus, .box input[type = "number"]:focus, .box select:focus, select:focus{
	 width: 280px;
	 border-color: #F2B56B;
}


.box button, button
{
	 border: 0;
	background: none;
	display: block;
	margin: 20px auto;
	text-align: center;
	border: 2px solid #F2B56B;
	padding: 14px 40px;
	outline: none;
	color: #0D0D0D;
	border-radius: 24px;
	transition: 0.25s;
	cursor: pointer;
}
.box button:hover, button:hover
{
	background: 	#1E90FF;
}

.table {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  border-radius: 1em;
  width: 100%;

}

.table td, .table th {
  border: 0px solid #ddd;
    border-radius: 1em;
  padding: 8px;
}

.table tr:nth-child(even){background-color: #f2f2f2;}

.table tr:hover {background-color: #ddd;}

.table th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #1E90FF;
  color: white;
}


</style>