const btn = document.getElementById("btnServicos");
const submenu = document.getElementById("submenu");

btn.addEventListener("click", function(e) {
    e.preventDefault();
    submenu.style.display =
        submenu.style.display === "block" ? "none" : "block";
});

// Fecha se clicar fora
document.addEventListener("click", function(e) {
    if (!btn.contains(e.target) && !submenu.contains(e.target)) {
        submenu.style.display = "none";
    }
});