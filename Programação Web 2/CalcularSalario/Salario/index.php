<!DOCTYPE html>
<html lang="pt-br">
    <link rel="stylesheet" href="style.css">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cálculo de Salário</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="index-page">

<form action="salario.php" method="post">
    <h2>Cálculo de Salário</h2>

    <label>Horas trabalhadas:
        <input type="text" name="txthoras" required>
    </label>

    <label>Valor por hora:
        <input type="text" name="txtvalor" required>
    </label>

    <input type="submit" value="Calcular">
    <input type="reset" value="Limpar">
</form>

</body>
</html>