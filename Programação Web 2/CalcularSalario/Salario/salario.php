<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculo de Salário</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {

    $horas = str_replace(",", ".", $_POST["txthoras"] ?? 0);
    $valor = str_replace(",", ".", $_POST["txtvalor"] ?? 0);

    $horas = (float) $horas;
    $valor = (float) $valor;

    $salario = $horas * $valor;

    echo "<div class='resultado-box'>";
    echo "<h3>Resultado do Cálculo</h3>";
    echo "<p><strong>Horas trabalhadas:</strong> " . number_format($horas, 2, ",", ".") . " h</p>";
    echo "<p><strong>Valor por hora:</strong> R$ " . number_format($valor, 2, ",", ".") . "</p>";
    echo "<p class='valor-final'><strong>Salário Final:</strong> R$ " . number_format($salario, 2, ",", ".") . "</p>";
    echo "</div>";
} else {
    echo "Acesse pela página do formulário.";
}
?>
</body>
</html>