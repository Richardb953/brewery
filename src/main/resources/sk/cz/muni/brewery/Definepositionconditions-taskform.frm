{"id":"cb8e1677-0836-4d03-9b10-251be599ecc8","name":"Definepositionconditions-taskform.frm","model":{"taskName":"Definepositionconditions","processId":"src.Recruitment","name":"task","properties":[{"name":"positionConditions","typeInfo":{"type":"OBJECT","className":"sk.cz.muni.brewery.positionConditions","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}},{"name":"positionOffer","typeInfo":{"type":"OBJECT","className":"sk.cz.muni.brewery.positionOffer","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"45e51e81-e7cc-4f46-b2e7-e0e75927b000","container":"FIELD_SET","id":"field_2753327088003362E12","name":"positionConditions","label":"PositionConditions","required":false,"readOnly":false,"validateOnChange":true,"binding":"positionConditions","standaloneClassName":"sk.cz.muni.brewery.positionConditions","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"5d429b00-d489-44b6-b50b-e75a9028526b","container":"FIELD_SET","id":"field_0586455929288197E12","name":"positionOffer","label":"PositionOffer","required":false,"readOnly":false,"validateOnChange":true,"binding":"positionOffer","standaloneClassName":"sk.cz.muni.brewery.positionOffer","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch1\u003eCreate conditions for new position offer\u003cbr\u003e\u003c/h1\u003e"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_2753327088003362E12","form_id":"cb8e1677-0836-4d03-9b10-251be599ecc8"}}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_0586455929288197E12","form_id":"cb8e1677-0836-4d03-9b10-251be599ecc8"}}]}]}]}}