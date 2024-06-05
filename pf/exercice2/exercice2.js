// Exercice 2

function listeRepas(liste) {
    return liste.reduce((acc, dev) => { acc[dev.Repas] = (acc[dev.Repas] || 0) + 1;return acc;},{});
}

const liste = [
    {FirstName: 'Noah', lastName: 'M.', pays: 'Suisse', continent: 'Europe', age: 19, langue: 'C',Repas: 'végétarien'},
    {FirstName: 'Anna', lastName: 'R.', pays: 'Liechtenstein', continent: 'Europe', age: 52, langue:'JavaScript',Repas: 'standard'},
    {FirstName: 'Ramona', lastName: 'R.', pays: 'Paraguay', continent: 'Amériques', age: 29, langue: 'Ruby',Repas: 'vegan'},
    {FirstName: 'George', lastName: 'B.', pays: 'Angleterre', continent: 'Europe', age: 81, langue: 'C',Repas: 'végétarien'}
];

console.log(listeRepas(liste));

/* Doit retourner {Végétarien: 2, standard: 1, vegan: 1} */