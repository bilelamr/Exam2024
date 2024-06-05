// Exercice 1

function calculateTip(montant, note){

    const tips = [
        {note:'terrible',pourcentage:0},
        {note:'poor',pourcentage:0.05},
        {note:'good',pourcentage:0.10},
        {note:'great',pourcentage:0.15},
        {note:'excellent',pourcentage:0.20}
    ];

    note = note.toLowerCase();

    const tip = tips.filter(pourboire => pourboire.note === note);

    if (tip.length > 0){
        return Math.ceil(montant * tip[0].pourcentage);
    }else{
        return "Rating not recognised";
    }
}

console.log(calculateTip(50, "GREat"));

/* Test

console.log(calculateTip(20, "ExcellEnt")); // Excellent service, vous donnez 20% de 20 = 4
console.log(calculateTip(26.95, "goOd")); // Bon service, 10% de 26.95 arrondi à 3
console.log(calculateTip(20, "hi"));

*/