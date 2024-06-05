// Exercice 3

function longestWord(sentence) {
    return sentence
        .split(" ")
        .reduce((longest, current) => current.length >= longest.length ? current : longest, "");
}

let sentence = "red blue grey";
let mot = longestWord(sentence);
console.log(mot);


/* A tester
longestWord('a b c d e fgh') => "fgh"
longestWord('one two three') => "three"
longestWord('red blue grey') => "grey" */