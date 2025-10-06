function externa() {
  function interna() {
    console.log("Internamente");
  }

  interna();
  console.log("Externamente");
}

externa();
