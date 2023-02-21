/**
 * 
 */
var inputCount = 0;

function add(){
	const generatedInputCount = document.getElementById("inputs").getElementsByClassName("one-set").length;
	if(generatedInputCount != 1){
		inputCount = generatedInputCount;
	}else{
		inputCount++;
	}
	
	const newNumLabel = document.createElement("label");
 	newNumLabel.textContent = `No.${inputCount + 1}: `;
	
	const newNameLabel = document.createElement("label");
	newNameLabel.textContent = "name: ";
	
 	const newNameInput = document.createElement("input");
 	newNameInput.type = "text";
 	newNameInput.setAttribute("id", "measureItemSettingFormList" + inputCount + ".itemName");
 	newNameInput.setAttribute("name", "measureItemSettingFormList[" + inputCount + "].itemName");
 	
 	const newTypeLabel = document.createElement("label");
 	newTypeLabel.textContent = "type: ";
	
 	const newTypeInput = document.createElement("input");
 	newTypeInput.type = "text";
 	newTypeInput.setAttribute("id", "measureItemSettingFormList" + inputCount + ".itemType");
 	newTypeInput.setAttribute("name", "measureItemSettingFormList[" + inputCount + "].itemType");

 	newNameLabel.appendChild(newNameInput);
 	newTypeLabel.appendChild(newTypeInput);
 	document.getElementById("inputs").appendChild(newNumLabel);
 	document.getElementById("inputs").appendChild(document.createElement("br"));
 	document.getElementById("inputs").appendChild(newNameLabel);
 	document.getElementById("inputs").appendChild(document.createElement("br"));
 	document.getElementById("inputs").appendChild(newTypeLabel);
 	document.getElementById("inputs").appendChild(document.createElement("hr"));
}
