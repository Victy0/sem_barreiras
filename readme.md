<h1>REST API DOCUMENTATION</h1>
<p>Documentação padronizada em REST API referente ao projeto Sem Barreiras Vagas.</p>
<p><b>API_URL_ROOT = https://sem-barreiras.herokuapp.com/<b><p>
<br>
<h3>Estado - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/estado</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“uf”: “RJ”,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;“uf”: “SP”,<br>
        &nbsp;&nbsp;}<br>
        &nbsp;],<br>
      &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0,<br>
      &nbsp;},<br>
      &nbsp;"totalPages": 1,<br>
      &nbsp;"totalElements": 1,<br>
      &nbsp;"last": true,<br>
      &nbsp;"sort": {<br>
        &nbsp;&nbsp;"unsorted": false,<br>
        &nbsp;&nbsp;"sorted": true,<br>
        &nbsp;&nbsp;"empty": false<br>
      &nbsp;},<br>
      &nbsp;"numberOfElements": 1,<br>
      &nbsp;"first": true,<br>
      &nbsp;"size": 26,<br>
      &nbsp;"number": 0,<br>
      &nbsp;"empty": false<br>
      &nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Estado - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/estado/{id}</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;“uf”: “RJ”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<!-- <h3>Estado - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/estado/</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
      &nbsp;"id": 0,<br>
      &nbsp;“uf”: “RJ”,<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;“uf”: “RJ”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Estado - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/estado/{id}</td>
  </tr>
  <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do estado<br></li>
      </ul>
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;“mensagem”: “Estado deletado com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br> -->
<h3>Cidade - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/cidade</td>
  </tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 0,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Rio de Janeiro",<br>
          &nbsp;&nbsp;&nbsp;"estado": {<br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id":0,<br>
          &nbsp;&nbsp;&nbsp;}
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 1,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Sao Paulo",<br>
          &nbsp;&nbsp;&nbsp;"estado": {<br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id":1,<br>
          &nbsp;&nbsp;&nbsp;}
        &nbsp;&nbsp;}<br>
        &nbsp;],<br>
        &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0,<br>
        &nbsp;},<br>
        &nbsp;"totalPages": 1,<br>
        &nbsp;"totalElements": 1,<br>
        &nbsp;"last": true,<br>
        &nbsp;"sort": {<br>
          &nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;"sorted": true,<br>
          &nbsp;&nbsp;"empty": false<br>
        &nbsp;},<br>
        &nbsp;"numberOfElements": 1,<br>
        &nbsp;"first": true,<br>
        &nbsp;"size": 26,<br>
        &nbsp;"number": 0,<br>
        &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr> 
</table>
<br>
<h3>Cidade - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/cidade/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da cidade<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;"estado": 0,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Cidade - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/cidade</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"nome": 0,<br>
        &nbsp;“estado”: { <br>
        &nbsp; &nbsp; "id": 0<br>
        &nbsp; }<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;“estado”: { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Cidade - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>PUT</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/cidade/alterar</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"id": 0,<br>
        &nbsp;"nome": "Niteroi",<br>
        &nbsp;“estado”: { <br>
        &nbsp; &nbsp; "id": 0<br>
        &nbsp; }<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;“estado”: { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Cidade - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/cidade/{id}</td>
  </tr>
  <td>params:</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da cidade<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Cidade deletada com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Deficiencia - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/deficiencia</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 0,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Deficiencia auditiva",<br>
          &nbsp;&nbsp;&nbsp;"necessidadeRampa": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadePisoTatil": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadeSonora": false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 1,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Deficiencia visual",<br>
          &nbsp;&nbsp;&nbsp;"necessidadeRampa": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadePisoTatil": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadeSonora": false,<br>
        &nbsp;&nbsp;}<br>
      &nbsp;],<br>
      &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0,<br>
      &nbsp;},<br>
      &nbsp;"totalPages": 1,<br>
      &nbsp;"totalElements": 1,<br>
      &nbsp;"last": true,<br>
      &nbsp;"sort": {<br>
        &nbsp;&nbsp;"unsorted": false,<br>
        &nbsp;&nbsp;"sorted": true,<br>
        &nbsp;&nbsp;"empty": false<br>
      &nbsp;},<br>
      &nbsp;"numberOfElements": 1,<br>
      &nbsp;"first": true,<br>
      &nbsp;"size": 26,<br>
      &nbsp;"number": 0,<br>
      &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Deficiencia - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/deficiencia/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da deficiencia<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Deficiencia auditiva",<br>
      &nbsp;"tipo": "Deficiencia auditiva",<br>
      &nbsp;"necessidadeRampa": false,<br>
      &nbsp;"necessidadePisoTatil": false,<br>
      &nbsp;"necessidadeSonora": false,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Deficiencia - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/deficiencia</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"descricao": "Deficiencia auditiva",<br>
        &nbsp;"necessidadeRampa": false,<br>
        &nbsp;"necessidadePisoTatil": false,<br>
        &nbsp;"necessidadeSonora": false,<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Deficiencia auditiva",<br>
      &nbsp;"necessidadeRampa": false,<br>
      &nbsp;"necessidadePisoTatil": false,<br>
      &nbsp;"necessidadeSonora": false,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Deficiencia - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>PUT</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/deficiencia/alterar</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"id": 0,<br>
        &nbsp;"descricao": "Deficiencia auditiva",<br>
        &nbsp;"necessidadeRampa": false,<br>
        &nbsp;"necessidadePisoTatil": false,<br>
        &nbsp;"necessidadeSonora": false,<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response:</td>
    <td>
      {<br>
        &nbsp;"id": 0,<br>
        &nbsp;"descricao": "Deficiencia auditiva",<br>
        &nbsp;"necessidadeRampa": false,<br>
        &nbsp;"necessidadePisoTatil": false,<br>
        &nbsp;"necessidadeSonora": false,<br>
      }<br>
    </td>
  </tr>
</table>
<br>
<h3>Deficiencia - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/deficiencia/{id}</td>
  </tr>
  <td>params:</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da deficiencia<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Deficiencia deletada com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Escolaridade - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/escolaridade</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Ensino medio completo",<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Ensino medio incompleto",<br>
        &nbsp;&nbsp;}<br>
      &nbsp;],<br>
      &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0,<br>
      &nbsp;},<br>
      &nbsp;"totalPages": 1,<br>
      &nbsp;"totalElements": 1,<br>
      &nbsp;"last": true,<br>
      &nbsp;"sort": {<br>
          &nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;"sorted": true,<br>
          &nbsp;&nbsp;"empty": false<br>
      &nbsp;},<br>
      &nbsp;"numberOfElements": 1,<br>
      &nbsp;"first": true,<br>
      &nbsp;"size": 26,<br>
      &nbsp;"number": 0,<br>
      &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Escolaridade - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/escolaridade/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da escolaridade<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Ensino medio completo",<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>AreaAtuacao - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/area</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Tecnologia da informacao",<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Vendas"<br>
        &nbsp;&nbsp;}<br>
      &nbsp;],<br>
      &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0<br>
      &nbsp;},<br>
      &nbsp;"totalPages": 1,<br>
      &nbsp;"totalElements": 1,<br>
      &nbsp;"last": true,<br>
      &nbsp;"sort": {<br>
        &nbsp;&nbsp;"unsorted": false,<br>
        &nbsp;&nbsp;"sorted": true,<br>
        &nbsp;&nbsp;"empty": false<br>
      &nbsp;},<br>
      &nbsp;"numberOfElements": 1,<br>
      &nbsp;"first": true,<br>
      &nbsp;"size": 26,<br>
      &nbsp;"number": 0,<br>
      &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>AreaAtuacao - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/area/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da area<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Vendas"<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>AreaAtuacao - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/area</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"descricao": "Vendas"<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Vendas"<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>AreaAtuacao - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>PUT</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/area/alterar</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"id": 0,<br>
        &nbsp;"descricao": "Vendas"<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Vendas"<br>
    }<br>
    </td>
  </tr>
</table>
<h3>AreaAtuacao - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/area/{id}</td>
  </tr>
  <td>params:</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da area<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Area de atuacao deletada com sucesso.”<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Vaga - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/vaga</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"dataCriacao": "29-03-2020",<br>
          &nbsp;&nbsp;&nbsp;"funcao": "Gerente",<br>
          &nbsp;&nbsp;&nbsp;"nivel": "Pleno",<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
          &nbsp;&nbsp;&nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
          &nbsp;&nbsp;&nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
          &nbsp;&nbsp;&nbsp;"beneficios": ["VR", "VA", "VT"],<br>
          &nbsp;&nbsp;&nbsp;"outrosBeneficos": "Seguro de vida",<br>
          &nbsp;&nbsp;&nbsp;"jornadaTrabalho": 8,<br>
          &nbsp;&nbsp;&nbsp;"duracaoVaga": 30,<br>
          &nbsp;&nbsp;&nbsp;"area": { <br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id": 0<br>
          &nbsp;&nbsp;&nbsp;},<br>
          &nbsp;&nbsp;&nbsp;"empresa": { <br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id": 0<br>
          &nbsp;&nbsp;&nbsp;},<br>
          &nbsp;&nbsp;&nbsp;"escolaridade": { <br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id": 0<br>
          &nbsp;&nbsp;&nbsp;}<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"dataCriacao": "09-10-2021",<br>
          &nbsp;&nbsp;&nbsp;"funcao": "Desenvolvedor",<br>
          &nbsp;&nbsp;&nbsp;"nivel": "Junior",<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Desenvolver sistemas web",<br>
          &nbsp;&nbsp;&nbsp;"requisitosNecessarios": ["Fácil Aprendizado", "inglês avançado", "Frances basico"],<br>
          &nbsp;&nbsp;&nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
          &nbsp;&nbsp;&nbsp;"beneficios": ["VR", "VA", "VT"],<br>
          &nbsp;&nbsp;&nbsp;"outrosBeneficos": "Seguro de vida e plano de saúde",<br>
          &nbsp;&nbsp;&nbsp;"jornadaTrabalho": 8,<br>
          &nbsp;&nbsp;&nbsp;"duracaoVaga": 20,<br>
          &nbsp;&nbsp;&nbsp;"area": { <br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id": 0<br>
          &nbsp;&nbsp;&nbsp;},<br>
          &nbsp;&nbsp;&nbsp;"empresa": { <br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id": 0<br>
          &nbsp;&nbsp;&nbsp;},<br>
          &nbsp;&nbsp;&nbsp;"escolaridade": { <br>
          &nbsp;&nbsp;&nbsp;&nbsp; "id": 0<br>
          &nbsp;&nbsp;&nbsp;}<br>
        &nbsp;&nbsp;}<br>
        &nbsp;],<br>
        &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0,<br>
        &nbsp;},<br>
        &nbsp;"totalPages": 1,<br>
        &nbsp;"totalElements": 1,<br>
        &nbsp;"last": true,<br>
        &nbsp;"sort": {<br>
          &nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;"sorted": true,<br>
          &nbsp;&nbsp;"empty": false<br>
        &nbsp;},<br>
        &nbsp;"numberOfElements": 1,<br>
        &nbsp;"first": true,<br>
        &nbsp;"size": 26,<br>
        &nbsp;"number": 0,<br>
        &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Vaga - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/vaga/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da vaga:<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"dataCriacao": "29-03-2020",<br>
      &nbsp;"funcao": "Gerente",<br>
      &nbsp;"nivel": "Pleno",<br>
      &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
      &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
      &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
      &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
      &nbsp;"outrosBeneficos": "Seguro de vida",<br>
      &nbsp;"jornadaTrabalho": 8,<br>
      &nbsp;"duracaoVaga": 30,<br>
      &nbsp;"area": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;},<br>
      &nbsp;"empresa": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;},<br>
      &nbsp;"escolaridade": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Vaga - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/vaga</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"dataCriacao": "29-03-2020",<br>
        &nbsp;"funcao": "Gerente",<br>
        &nbsp;"nivel": "Pleno",<br>
        &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
        &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
        &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
        &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
        &nbsp;"outrosBeneficos": "Seguro de vida",<br>
        &nbsp;"jornadaTrabalho": 8,<br>
        &nbsp;"duracaoVaga": 30,<br>
        &nbsp;"area": { <br>
        &nbsp;&nbsp; "id": 0<br>
        &nbsp;},<br>
        &nbsp;"empresa": { <br>
        &nbsp;&nbsp; "id": 0<br>
        &nbsp;},<br>
        &nbsp;"escolaridade": { <br>
        &nbsp;&nbsp; "id": 0<br>
        &nbsp;}<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"dataCriacao": "29-03-2020",<br>
      &nbsp;"funcao": "Gerente",<br>
      &nbsp;"nivel": "Pleno",<br>
      &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
      &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
      &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
      &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
      &nbsp;"outrosBeneficos": "Seguro de vida",<br>
      &nbsp;"jornadaTrabalho": 8,<br>
      &nbsp;"duracaoVaga": 30,<br>
      &nbsp;"area": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;},<br>
      &nbsp;"empresa": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;},<br>
      &nbsp;"escolaridade": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Vaga - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>PUT</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/vaga/alterar</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"id": “0”,<br>
        &nbsp;"dataCriacao": "29-03-2020",<br>
        &nbsp;"funcao": "Gerente",<br>
        &nbsp;"nivel": "Pleno",<br>
        &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
        &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
        &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
        &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
        &nbsp;"outrosBeneficos": "Seguro de vida",<br>
        &nbsp;"jornadaTrabalho": 8,<br>
        &nbsp;"duracaoVaga": 30,<br>
        &nbsp;"area": { <br>
        &nbsp;&nbsp; "id": 0<br>
        &nbsp;},<br>
        &nbsp;"empresa": { <br>
        &nbsp;&nbsp; "id": 0<br>
        &nbsp;},<br>
        &nbsp;"escolaridade": { <br>
        &nbsp;&nbsp; "id": 0<br>
        &nbsp;}<br>
        }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"dataCriacao": "29-03-2020",<br>
      &nbsp;"funcao": "Gerente",<br>
      &nbsp;"nivel": "Pleno",<br>
      &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
      &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
      &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
      &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
      &nbsp;"outrosBeneficos": "Seguro de vida",<br>
      &nbsp;"jornadaTrabalho": 8,<br>
      &nbsp;"duracaoVaga": 30,<br>
      &nbsp;"area": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;},<br>
      &nbsp;"empresa": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;},<br>
      &nbsp;"escolaridade": { <br>
      &nbsp;&nbsp; "id": 0<br>
      &nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Vaga - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>PUT</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/vaga/candidatar/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da vaga<br></li>
    </ul>
  </td>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"email": “gil_123@gmail.com”,<br>
        &nbsp;"nome": "Gilberto",<br>
        &nbsp;"telefone": "2199999-9999"<br>
      }<br>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Candidatura realizada com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Vaga - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/vaga/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da vaga<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Vaga deletada com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Curso - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/curso</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: “Excel avancado”,<br>
          &nbsp;&nbsp;&nbsp;“descricao”: “Aprenda a dominar o excel.”,<br>
          &nbsp;&nbsp;&nbsp;“hiperLink”: “https://certificadocursosonline.com/cursos/curso-de-excel/”,<br>
          &nbsp;&nbsp;&nbsp;"preco": 27.90,<br>
          &nbsp;&nbsp;&nbsp;"vaga": {<br>
          &nbsp;&nbsp;&nbsp;&nbsp;"id": 0<br>
          &nbsp;&nbsp;&nbsp;}<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: Java avancado”,<br>
          &nbsp;&nbsp;&nbsp;“descricao”: “Aprenda a programar em java.”,<br>
          &nbsp;&nbsp;&nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
          &nbsp;&nbsp;&nbsp;"preco": 37.90,<br>
          &nbsp;&nbsp;&nbsp;"vaga": {<br>
          &nbsp;&nbsp;&nbsp;&nbsp;"id": 1<br>
          &nbsp;&nbsp;&nbsp;}<br>
        &nbsp;&nbsp;}<br>
      &nbsp;],<br>
      &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0<br>
      &nbsp;},<br>
      &nbsp;"totalPages": 1,<br>
      &nbsp;"totalElements": 1,<br>
      &nbsp;"last": true,<br>
      &nbsp;"sort": {<br>
        &nbsp;&nbsp;"unsorted": false,<br>
        &nbsp;&nbsp;"sorted": true,<br>
        &nbsp;&nbsp;"empty": false<br>
      &nbsp;},<br>
      &nbsp;"numberOfElements": 1,<br>
      &nbsp;"first": true,<br>
      &nbsp;"size": 26,<br>
      &nbsp;"number": 0,<br>
      &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Curso - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/curso/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Excel avancado”,<br>
      &nbsp;“descricao”: “Aprenda a dominar o excel.”,<br>
      &nbsp;“hiperLink”: “https://certificadocursosonline.com/cursos/curso-de-excel/”,<br>
      &nbsp;"preco": 27.90,<br>
      &nbsp;&nbsp;&nbsp;"vaga": {<br>
      &nbsp;&nbsp;&nbsp;&nbsp;"id": 0<br>
      &nbsp;&nbsp;&nbsp;}<br>
    }<br>
    </td>
  </tr>
</table>
<h3>Curso - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/curso</td>
  </tr>
  <tr>
    <td>body</td>
    <td>
      {<br>
        &nbsp;“nome”: Java avancado”,<br>
        &nbsp;“descricao”: “Aprenda a programar em java.”,<br>
        &nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
        &nbsp;"preco": 37.90,<br>
        &nbsp;“vaga”: { <br>
        &nbsp; &nbsp; "id": 0<br>
        &nbsp; }<br>
      }<br>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “1”,<br>
      &nbsp;“nome”: Java avancado”,<br>
      &nbsp;“descricao”: “Aprenda a programar em java.”,<br>
      &nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
      &nbsp;"preco": 37.90,<br>
      &nbsp;“vaga”: { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp; }<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Curso - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/curso/alterar</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"id": “1”,<br>
        &nbsp;“nome”: Java avancado”,<br>
        &nbsp;“descricao”: “Aprenda a programar em java.”,<br>
        &nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
        &nbsp;"preco": 37.90,<br>
        &nbsp;“vaga”: { <br>
        &nbsp; &nbsp; "id": 0<br>
        &nbsp; }<br>
      }<br>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “1”,<br>
      &nbsp;“nome”: Java avancado”,<br>
      &nbsp;“descricao”: “Aprenda a programar em java.”,<br>
      &nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
      &nbsp;"preco": 37.90,<br>
      &nbsp;“vaga”: { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp; }<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Curso - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/curso/{id}</td>
  </tr>
  <td>params</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;“mensagem”: "Curso deletado com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Empresa - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>page:</b><br></li>
        <li>número opcional da página da listagem<br></li>
        <li><b>size:</b><br></li>
        <li>tamanho opcional da página da listagem<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"content": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: “Ambev",<br>
          &nbsp;&nbsp;&nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
          &nbsp;&nbsp;&nbsp;“cnpj”: “43277397000176",<br>
          &nbsp;&nbsp;&nbsp;"email": "institucional@ambev.com",<br>
          &nbsp;&nbsp;&nbsp;"telefone": "21987723341",<br>
          &nbsp;&nbsp;&nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
          &nbsp;&nbsp;&nbsp;"cidade": {<br>
          &nbsp;&nbsp;&nbsp;&nbsp;"id": 0<br>
          &nbsp;&nbsp;&nbsp;}<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: Colgate",<br>
          &nbsp;&nbsp;&nbsp;“nomeFantasia”: "COLGATE IND.”,<br>
          &nbsp;&nbsp;&nbsp;“cnpj”: "34434685000104",<br>
          &nbsp;&nbsp;&nbsp;"email": "institucional@colgate.com",<br>
          &nbsp;&nbsp;&nbsp;"telefone": "11983226532",<br>
          &nbsp;&nbsp;&nbsp;"endereco": "Av. Paulista, 1294 - Bela VistaSão Paulo - SP",<br>
          &nbsp;&nbsp;&nbsp;"cidade": {<br>
          &nbsp;&nbsp;&nbsp;&nbsp;"id": 1<br>
          &nbsp;&nbsp;&nbsp;}<br>
        &nbsp;&nbsp;}<br>
        &nbsp;]<br>
        &nbsp;"pageable": {<br>
        &nbsp;&nbsp;"sort": {<br>
          &nbsp;&nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;&nbsp;“sorted”: true,<br>
          &nbsp;&nbsp;&nbsp;“empty”: false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;"pageSize": 26,<br>
        &nbsp;&nbsp;"pageNumber": 0,<br>
        &nbsp;&nbsp;"offset": 0,<br>
        &nbsp;&nbsp;"paged": 0,<br>
        &nbsp;&nbsp;"unpaged": 0,<br>
        &nbsp;}<br>
        &nbsp;"totalPages": 1,<br>
        &nbsp;"totalElements": 1,<br>
        &nbsp;"last": true,<br>
        &nbsp;"sort": {<br>
          &nbsp;&nbsp;"unsorted": false,<br>
          &nbsp;&nbsp;"sorted": true,<br>
          &nbsp;&nbsp;"empty": false<br>
        &nbsp;}<br>
        &nbsp;"numberOfElements": 1,<br>
        &nbsp;"first": true,<br>
        &nbsp;"size": 26,<br>
        &nbsp;"number": 0,<br>
        &nbsp;"empty": false<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Empresa - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Ambev",<br>
      &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
      &nbsp;“cnpj”: “43277397000176",<br>
      &nbsp;"email": "institucional@ambev.com",<br>
      &nbsp;"telefone": "21987723341",<br>
      &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
      &nbsp;“cidade”: { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp; }<br>
    }<br>
    </td>
  </tr>
</table>
<h3>Empresa - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa</td>
  </tr>
  <tr>
    <td>body</td>
    <td>
      {<br>
        &nbsp;“nome”: “Ambev",<br>
        &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
        &nbsp;“cnpj”: “43277397000176",<br>
        &nbsp;"email": "institucional@ambev.com",<br>
        &nbsp;"telefone": "21987723341",<br>
        &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
        &nbsp;"cidade": { <br>
        &nbsp; &nbsp; "id": 0<br>
        &nbsp; }<br>
      }<br>     
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Ambev",<br>
      &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
      &nbsp;“cnpj”: “43277397000176",<br>
      &nbsp;"email": "institucional@ambev.com",<br>
      &nbsp;"telefone": "21987723341",<br>
      &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
      &nbsp;"cidade": { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp; }<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Empresa - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa/alterar</td>
  </tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"id": “0”,<br>
        &nbsp;“nome”: “Ambev",<br>
        &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
        &nbsp;“cnpj”: “43277397000176",<br>
        &nbsp;"email": "institucional@ambev.com",<br>
        &nbsp;"telefone": "21987723341",<br>
        &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
        &nbsp;"cidade": { <br>
        &nbsp; &nbsp; "id": 0<br>
        &nbsp; }<br>
      }<br>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Ambev",<br>
      &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
      &nbsp;“cnpj”: “43277397000176",<br>
      &nbsp;"email": "institucional@ambev.com",<br>
      &nbsp;"telefone": "21987723341",<br>
      &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
      &nbsp;"cidade": { <br>
      &nbsp; &nbsp; "id": 0<br>
      &nbsp; }<br>
    }<br>
  </tr>
</table>
<br>
<h3>Empresa - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa/{id}</td>
  </tr>
  <td>params</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;“mensagem”: "Empresa deletada com sucesso.”,<br>
    }<br>
    </td>
  </tr>
</table>
<br>
</table>
<br>
<h3>Empresa - POST [login]</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa/login</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      <td>body:</td>
    <td>
      {<br>
        &nbsp;"email": "institucional@ambev.com",<br>
      }<br>      
    </td>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Código de verificação enviado por e-mail",<br>
    }<br>
    </td>
  </tr>
</table>
<br>
<h3>Empresa - POST [login]</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>{{API_URL_ROOT}}/empresa/login-confirma</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      {<br>
        &nbsp;"email": "institucional@ambev.com",<br>
        &nbsp;"codigo": "7770",<br>
      }<br>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Autenticação concluída com sucesso",<br>
    }<br>
    </td>
  </tr>
</table