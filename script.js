let inputAge = Number(prompt('Enter Age : '));


const ageChecker = (age) => {

    if(age < 0) return "Invalid Age";

    let ageResult = age < 12 ?  "Child": 
                    age < 19 ? "Teenager":
                    age < 35 ? "Young Adult":
                    age < 55 ? "Adult":
                    "Senior";
    

    return `Age : ${inputAge} : ${ageResult}`;
}

console.log(ageChecker(inputAge));