async function getBanks() {
    let url = 'http://localhost:4005/token/';
    try {
        let res = await fetch(url);
        return await res.json();
    } catch (error) {
        console.log(error);
    }
}

async function renderBanks() {
    let banks = await getBanks();
    let html = '';
    banks.forEach(banking => {
        let htmlSegment = `<div class="col">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">${banking.token_number}</h5>
            <p class="card-text">${banking.token_status} <br>
            ${banking.token_Time}<br>
            ${banking.token_Date}
            
            </p>
          </div>
        </div>
      </div>`;

        html += htmlSegment;
    });

    let container = document.getElementById('task-grid');
    container.innerHTML = html;
}

renderBanks();